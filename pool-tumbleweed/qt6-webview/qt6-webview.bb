SUMMARY = "Qt 6 WebView library"
DESCRIPTION = "Qt WebView lets you display web content inside a QML application. To avoid \
including a full web browser stack, Qt WebView uses native APIs where \
appropriate."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webview-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "28e0489f30cc10f3f2ebac6abc640e2e693623230616c4dd939c6d7b8644ceb77056244dff132bbac80e1b193db375862f5b5617c27971f40842a2fc1d5a2003"

RPROVIDES:${PN} += "libqtwebview_webengine.so()(64bit) \
libqtwebview_webengine.so(Qt_6)(64bit) \
libqtwebview_webengine.so(Qt_6.0)(64bit) \
libqtwebview_webengine.so(Qt_6.1)(64bit) \
libqtwebview_webengine.so(Qt_6.2)(64bit) \
libqtwebview_webengine.so(Qt_6.3)(64bit) \
libqtwebview_webengine.so(Qt_6.4)(64bit) \
libqtwebview_webengine.so(Qt_6.5)(64bit) \
libqtwebview_webengine.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-webview \
qt6-webview(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6WebEngineCore.so.6()(64bit) \
libQt6WebEngineCore.so.6(Qt_6)(64bit) \
libQt6WebEngineQuick.so.6()(64bit) \
libQt6WebEngineQuick.so.6(Qt_6)(64bit) \
libQt6WebEngineQuick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6WebView.so.6()(64bit) \
libQt6WebView.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6WebViewQuick.so.6()(64bit) \
libQt6WebViewQuick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
