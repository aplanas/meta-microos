SUMMARY = "Qt 6 WebViewQuick library"
DESCRIPTION = "The Qt6 WebViewQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WebViewQuick6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b5f00b099d7474f6095a9ce5e9249e093780e5b125c5134b164f0ed9c39c1d2ac4efcc33dacdcc26e8aa9a4dab7076bef0c13a033fdc6d264ff626819d4bc21f"

RPROVIDES:${PN} += "libQt6WebViewQuick.so.6 \
libQt6WebViewQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebView.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
