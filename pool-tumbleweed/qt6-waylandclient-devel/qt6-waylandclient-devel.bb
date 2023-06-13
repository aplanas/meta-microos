SUMMARY = "Development files for the Qt 6 WaylandClient library"
DESCRIPTION = "Development files for the Qt6 WaylandClient library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandclient-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3c9b1805ff006446a697254ac757c7bb58e388e273dd544108a441badc9b183be1d3a6b651cfaa2a1347b3d16803b9f54785ea0090806dd056ffe278d490678e"

RPROVIDES:${PN} += "cmake(Qt6WaylandClient) \
cmake(Qt6WaylandScannerTools) \
pkgconfig(Qt6WaylandClient) \
qt6-waylandclient-devel \
qt6-waylandclient-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Gui) \
cmake(Qt6WaylandGlobalPrivate) \
libQt6WaylandClient6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
qt6-wayland"

inherit rpm
