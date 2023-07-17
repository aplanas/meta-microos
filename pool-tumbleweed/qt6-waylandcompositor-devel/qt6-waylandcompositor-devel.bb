SUMMARY = "Development files for the Qt6 WaylandCompositor library"
DESCRIPTION = "Development files for the Qt6 WaylandCompositor library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandcompositor-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "f4ba563746033915e7cc1487f22a6e888be79fd26828a1fe5897ea00228f94d6a0eafb8783e603ba005f9c27054bdb2ea8a0573f24b123646090d4dc12f96508"

RPROVIDES:${PN} += "cmake-Qt6WaylandCompositor \
pkgconfig-Qt6WaylandCompositor \
qt6-waylandcompositor-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6WaylandGlobalPrivate \
libQt6WaylandCompositor6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick"

inherit rpm
