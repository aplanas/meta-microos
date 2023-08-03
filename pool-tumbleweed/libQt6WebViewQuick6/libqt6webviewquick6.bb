SUMMARY = "Qt 6 WebViewQuick library"
DESCRIPTION = "The Qt6 WebViewQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6WebViewQuick6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5c782ab08ed64119dc71ab8e85c2839488a62ea3b2a1de1198b9f56d725c150c6811d681d7de0ac4ba157407685dbd214f8ba0ef5be4146f3401f9d1026a2ea8"

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
