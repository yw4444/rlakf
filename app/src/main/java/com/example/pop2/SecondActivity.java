package com.example.pop2;  // 현재 패키지명에 맞춰 수정하세요.

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);  // 레이아웃 연결
    }
}
