SUMMARY = "Qt 6 WaylandClient library"
DESCRIPTION = "The Qt 6 WaylandClient library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WaylandClient6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "a3b1437c8f35e531694d0a1c219c37e7850e4fe84811e38cb2a9c08bbf2ea2f8b493fa79a924377c0cbc97ad632e8582bbf3b1fc7075eefb567964387d45b86b"

RPROVIDES:${PN} += "libQt6WaylandClient.so.6 \
libQt6WaylandClient6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0"

inherit rpm
