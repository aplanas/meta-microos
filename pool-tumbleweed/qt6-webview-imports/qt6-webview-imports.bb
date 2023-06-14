SUMMARY = "Qt 6 WebView QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebView module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webview-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e948d5cf4cada81bec9989f6693d15a6bb72f5e1241437fe0da2755be6058d26c52b58ebdbc3aaaf34e3271169e291a19c988ca49a4d2b60c09a5efc4bbd8025"

RPROVIDES:${PN} += "libqtwebviewquickplugin.so \
qt6-webview-imports \
qt6qmlimport-QtWebView.1 \
qt6qmlimport-QtWebView.2 \
qt6qmlimport-QtWebView.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6WebViewQuick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
