SUMMARY = "Development files for the Qt 6 WaylandClient library"
DESCRIPTION = "Development files for the Qt6 WaylandClient library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandclient-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "9dc34a7ed41b94798da15ad7d2a8354f4caa8c31172424b4f8299e8955712173a9ab1df3323facded919cc4462c667fb9366e22324f8d02698ef86956382937c"

RPROVIDES:${PN} += "cmake-Qt6WaylandClient \
cmake-Qt6WaylandScannerTools \
pkgconfig-Qt6WaylandClient \
qt6-waylandclient-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6WaylandCompositor \
cmake-Qt6WaylandGlobalPrivate \
libQt6WaylandClient6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
qt6-wayland"

inherit rpm
