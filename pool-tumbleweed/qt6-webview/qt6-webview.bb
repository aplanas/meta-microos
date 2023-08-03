SUMMARY = "Qt 6 WebView library"
DESCRIPTION = "Qt WebView lets you display web content inside a QML application. To avoid \
including a full web browser stack, Qt WebView uses native APIs where \
appropriate."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-webview-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8f41ffbdca824cfedeb4af981342f20041459bca082ad30a5a7694cde8c0daad96f2fa3cf6568cb069bb9eb1086c0963f251113c14cfaa20e8c8810c555da809"

RPROVIDES:${PN} += "libqtwebview-webengine.so \
qt6-webview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6WebView.so.6 \
libQt6WebViewQuick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
