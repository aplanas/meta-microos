SUMMARY = "Qt 6 WebViewQuick library"
DESCRIPTION = "The Qt6 WebViewQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WebViewQuick6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b5f00b099d7474f6095a9ce5e9249e093780e5b125c5134b164f0ed9c39c1d2ac4efcc33dacdcc26e8aa9a4dab7076bef0c13a033fdc6d264ff626819d4bc21f"

RPROVIDES:${PN} += "libQt6WebViewQuick.so.6()(64bit) \
libQt6WebViewQuick.so.6(Qt_6)(64bit) \
libQt6WebViewQuick.so.6(Qt_6.0)(64bit) \
libQt6WebViewQuick.so.6(Qt_6.1)(64bit) \
libQt6WebViewQuick.so.6(Qt_6.2)(64bit) \
libQt6WebViewQuick.so.6(Qt_6.3)(64bit) \
libQt6WebViewQuick.so.6(Qt_6.4)(64bit) \
libQt6WebViewQuick.so.6(Qt_6.5)(64bit) \
libQt6WebViewQuick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6WebViewQuick6 \
libQt6WebViewQuick6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6Quick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6WebView.so.6()(64bit) \
libQt6WebView.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
