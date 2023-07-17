SUMMARY = "Qt 6 WebView QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebView module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webview-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "f749d5c90c6c99fbb6fc8bfc79f871f95c992b866ddec9a8681c419d2915b4588d2cdff11e922aab8119eeff5158c05606dc38fed5cd4db7a856c9b8f99aa21d"

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
