SUMMARY = "Development files for the Qt 6 WaylandClient library"
DESCRIPTION = "Development files for the Qt6 WaylandClient library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-waylandclient-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f0f56d88c4808acd2ff24e195d5a920f42a925e682d5b42bb6291cf8ef717bd4f946b01d38f87a2763978d7da7db78232400c1d8ba793f9ef301c8eb003530cc"

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
