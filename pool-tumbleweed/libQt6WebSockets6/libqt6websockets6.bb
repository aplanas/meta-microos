SUMMARY = "Qt 6 WebSockets library"
DESCRIPTION = "The Qt WebSockets module provides C++ and QML interfaces that enable \
Qt applications to act as a server that can process WebSocket \
requests, or a client that can consume data received from the server, \
or both."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WebSockets6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9ed86670388252db03486c60af70009ccee51956d20a0e4db11ea25940046ae5c06f40ef86892ee81ef43c7cf78769b48ff3bee8418acac4e27236970dcbffbe"

RPROVIDES:${PN} += "libQt6WebSockets.so.6 \
libQt6WebSockets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
