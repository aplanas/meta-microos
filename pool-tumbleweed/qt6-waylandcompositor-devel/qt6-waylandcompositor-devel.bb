SUMMARY = "Development files for the Qt6 WaylandCompositor library"
DESCRIPTION = "Development files for the Qt6 WaylandCompositor library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandcompositor-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "9ab152c9371bb8fb03bf44c73f969641e6825421effe2e6909400a17d691ff7dbe96721b84b6adb07bd27eefd10a40da8d0ba6b087f60bdb9746e4a8d6a7707b"

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
