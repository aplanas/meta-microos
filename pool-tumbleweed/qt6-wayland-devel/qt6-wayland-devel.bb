SUMMARY = "Qt6 Wayland development meta package"
DESCRIPTION = "This meta-package requires all the qt6-wayland development packages."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-wayland-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "70cfd207483ba6f6f025f75777bcab5f5c7359509d3b0e82e60f7c328e5b72f75968524ab7e62f08f5c0ab43f86ee24fb4ae45b4960180e3d3297fbc0f3d236f"

RPROVIDES:${PN} += "qt6-wayland-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandClient \
cmake-Qt6WaylandCompositor \
cmake-Qt6WaylandGlobalPrivate"

inherit rpm
