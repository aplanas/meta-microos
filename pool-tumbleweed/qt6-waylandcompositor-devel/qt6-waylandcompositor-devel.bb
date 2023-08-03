SUMMARY = "Development files for the Qt6 WaylandCompositor library"
DESCRIPTION = "Development files for the Qt6 WaylandCompositor library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-waylandcompositor-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7019e7d309e65496def87e553e25235e591b456a1a5159d8c9607a2ebbaff1b2e7be93904407196c418c6cf80092d28952f73a1089219e6886988dde660f6203"

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
