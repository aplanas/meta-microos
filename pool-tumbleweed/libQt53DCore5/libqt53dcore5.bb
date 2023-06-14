SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
Qt 3D provides functionality for near-realtime simulation \
systems with support for 2D and 3D rendering in both Qt C++ and Qt Quick applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DCore5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "2bb28d7927afa12304762b47ece4a66ec6f40f42d43b91230ef8a432e8479e3c81f4080d1967541e842f56080fb15c6ae0f4a4426c0b2b91092f016a7f875643"

RPROVIDES:${PN} += "libQt53DCore.so.5 \
libQt53DCore5 \
libQt53dCollision5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
