SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
Qt 3D provides functionality for near-realtime simulation \
systems with support for 2D and 3D rendering in both Qt C++ and Qt Quick applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DCore5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "3231caea18ecfdc63a80cf2b1fb74c0c15ffb2454747a12bd89afaee1fdf7ee3bb51a5358a808f0b0e85aa35e2ac624d74a92faf8fd411d2486fdcb9b215b3ea"

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
