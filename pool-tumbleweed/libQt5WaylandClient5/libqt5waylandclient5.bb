SUMMARY = "Qt 5 Wayland Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde51"

RPM_NAME = "libQt5WaylandClient5-5.15.10+kde51-1.1.aarch64.rpm"
RPM_HASH = "e99936f2dc52dd97ecd70ea488452ace6e28d2460d1d3be0354617c09736e8492c742263962fe6d2d403c67c125b2a3fa9d4331392dd122dbc31594c3eabe6f5"

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
