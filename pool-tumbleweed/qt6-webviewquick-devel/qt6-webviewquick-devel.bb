SUMMARY = "Qt 6 WebViewQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebViewQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webviewquick-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "78ca0d30985fca6135af38f55fe660c52cd969c80f2e792a17500860f13e3ac71fdaefed0cedc3dbc94df1f77457e48f497a8cd1d2552db0a90d7433d200cbc5"

RPROVIDES:${PN} += "cmake-Qt6WebViewQuick \
pkgconfig-Qt6WebViewQuick \
qt6-webviewquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6OpenGL \
cmake-Qt6QmlModels \
cmake-Qt6Quick \
cmake-Qt6WebView \
libQt6WebViewQuick6 \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6QmlModels \
pkgconfig-Qt6Quick"

inherit rpm
