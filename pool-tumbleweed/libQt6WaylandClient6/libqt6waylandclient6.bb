SUMMARY = "Qt 6 WaylandClient library"
DESCRIPTION = "The Qt 6 WaylandClient library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WaylandClient6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "142621fa6fffcb354f8683953b0b9c2b5f8c14a0bf178413c80d88017c71e89d3eeea8ac486532d27d226d45527485f993683c25ef86bb3a9d9127823c74ea90"

RPROVIDES:${PN} += "libQt6WaylandClient.so.6()(64bit) \
libQt6WaylandClient.so.6(Qt_6)(64bit) \
libQt6WaylandClient6 \
libQt6WaylandClient6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit) \
libxkbcommon.so.0()(64bit)"

inherit rpm
