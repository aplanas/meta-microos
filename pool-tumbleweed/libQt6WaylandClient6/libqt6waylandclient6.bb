SUMMARY = "Qt 6 WaylandClient library"
DESCRIPTION = "The Qt 6 WaylandClient library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WaylandClient6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "1632fbe81c34faff419a5b0e30709ef86f1c3830a515826246b8629451641bb2f59344dbd2f99b7a293f99d87ce0a026350ee252c5b1461676aab3363f8db059"

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
