SUMMARY = "Qt5 websockets examples"
DESCRIPTION = "Examples for the libqt5-qtwebsockets module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde2"

RPM_NAME = "libqt5-qtwebsockets-examples-5.15.10+kde2-1.1.aarch64.rpm"
RPM_HASH = "4d9d03a1af210b247b8803409e497502c03bfdc90d64c90462fd39eff8c659c40d4edb56ecc0f52ad76152e849604f7e1d99420ea0a802dbf13b3da36141b826"

RPROVIDES:${PN} += "libqt5-qtwebsockets-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Quick.so.5 \
libQt5WebSockets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtWebSockets.1"

inherit rpm
