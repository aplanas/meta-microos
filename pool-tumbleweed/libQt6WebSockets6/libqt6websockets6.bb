SUMMARY = "Qt 6 WebSockets library"
DESCRIPTION = "The Qt WebSockets module provides C++ and QML interfaces that enable \
Qt applications to act as a server that can process WebSocket \
requests, or a client that can consume data received from the server, \
or both."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6WebSockets6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c84d5b59d4fddee5b1f49f68592147b55b436c6fb7e8de31088f5355b4be4a84e470b06bc98d29dd9ce626a964ce11953e3526904df4677ab2c1a32169bcecf1"

RPROVIDES:${PN} += "libQt6WebSockets.so.6 \
libQt6WebSockets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
