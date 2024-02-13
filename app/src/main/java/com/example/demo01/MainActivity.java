package com.example.demo01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    WebView wV;
    EditText eT;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wV = findViewById(R.id.wV);
        eT = findViewById(R.id.eT);

        wV.getSettings().setJavaScriptEnabled(true);


    }


    public void go(View view) {
        wV.setWebViewClient(new MyWebViewClient());
        String stringUrl = eT.getText().toString();
        wV.loadUrl(stringUrl);
    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;

        }
    }
}