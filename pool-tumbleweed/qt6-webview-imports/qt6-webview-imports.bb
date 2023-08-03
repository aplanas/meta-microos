SUMMARY = "Qt 6 WebView QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebView module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-webview-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "afbdec0358cd52b90abd1db24ecf5ce847abb52852a469328cd04fd14dc4d3976ef01ecfe7a53a4f7e069ddf1e5533dcd72e2212b34389b2fda7ebb721a4f5e0"

RPROVIDES:${PN} += "libqtwebviewquickplugin.so \
qt6-webview-imports \
qt6qmlimport-QtWebView.1 \
qt6qmlimport-QtWebView.2 \
qt6qmlimport-QtWebView.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6WebViewQuick.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtWebEngine.2"

inherit rpm
