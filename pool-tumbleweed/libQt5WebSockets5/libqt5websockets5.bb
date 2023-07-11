SUMMARY = "Qt 5 WebSockets Library"
DESCRIPTION = "The Qt WebSockets module provides C++ and QML interfaces that enable \
Qt applications to act as a server that can process WebSocket \
requests, or a client that can consume data received from the server, \
or both."
LICENSE = "LGPL-3.0-only |  (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde2"

RPM_NAME = "libQt5WebSockets5-5.15.10+kde2-1.1.aarch64.rpm"
RPM_HASH = "512638255b111dbe0ea8065931c701400073d639b9ef40b30e35d4da06aba1840605c3c9897affb46a2e2b55875b89f346e1153e8426f2ab4d66b057386e3a95"

RPROVIDES:${PN} += "libQt5WebSockets.so.5 \
libQt5WebSockets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Network5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
