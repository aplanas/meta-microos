SUMMARY = "Qt 5 WebSockets Library"
DESCRIPTION = "The Qt WebSockets module provides C++ and QML interfaces that enable \
Qt applications to act as a server that can process WebSocket \
requests, or a client that can consume data received from the server, \
or both."
LICENSE = "LGPL-3.0-only |  (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde2"

RPM_NAME = "libQt5WebSockets5-5.15.9+kde2-1.1.aarch64.rpm"
RPM_HASH = "4ec238da43b2c1ee521ce85f11667085f7a9234445de5b922c7bf3fbfa1cc9f6bf2787c4853366561d5f0eb4a9bf48892d01830158648033f4dab90edc9e4114"

RPROVIDES:${PN} += "libQt5WebSockets.so.5()(64bit) \
libQt5WebSockets.so.5(Qt_5)(64bit) \
libQt5WebSockets5 \
libQt5WebSockets5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Network5 \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
