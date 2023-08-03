SUMMARY = "Qt 6 WaylandClient library"
DESCRIPTION = "The Qt 6 WaylandClient library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6WaylandClient6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "179dac50218680b3d6ffa66f66fa330526c81c565ed30c27751b24a9b23bf8b98ba2a12e0465a2812d1783f72916cebd2d9f809f31f381513afe0c44084411d7"

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
