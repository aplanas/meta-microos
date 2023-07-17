SUMMARY = "Qt 6 WebView library"
DESCRIPTION = "Qt WebView lets you display web content inside a QML application. To avoid \
including a full web browser stack, Qt WebView uses native APIs where \
appropriate."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webview-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "248785edf809b6e0422fb620c7be78fd7600dd4401f477c2f84651e540539d5d0dc0a7e70e04a682798ef82ab384896ec3b97d7674608760db204e1114d7246f"

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
