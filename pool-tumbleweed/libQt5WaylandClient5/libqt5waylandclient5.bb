SUMMARY = "Qt 5 Wayland Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde55"

RPM_NAME = "libQt5WaylandClient5-5.15.9+kde55-1.1.aarch64.rpm"
RPM_HASH = "3efdfee2d788392fd8dd7a383de40487cb6f49a8524185ca1220ba377bec7b4df4f2b26dd0c1b593ded915fc5665e9267eab63d7ad71caa3b897f31ea877b512"

RPROVIDES:${PN} += "libQt5WaylandClient.so.5 \
libQt5WaylandClient5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0"

inherit rpm
