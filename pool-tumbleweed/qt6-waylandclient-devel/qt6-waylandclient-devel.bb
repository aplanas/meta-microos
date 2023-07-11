SUMMARY = "Development files for the Qt 6 WaylandClient library"
DESCRIPTION = "Development files for the Qt6 WaylandClient library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandclient-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "b6e7555d77e89418ff48d2a1f702535b5d862161f49ed25d82a366a46c67a2df3b818b1ae8f1dd1ce78c1398964aa9a6811b03a6dfc8e4e557b788825eb48b2f"

RPROVIDES:${PN} += "cmake-Qt6WaylandClient \
cmake-Qt6WaylandScannerTools \
pkgconfig-Qt6WaylandClient \
qt6-waylandclient-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6WaylandGlobalPrivate \
libQt6WaylandClient6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
qt6-wayland"

inherit rpm
