SUMMARY = "Qt 5 Wayland Addon"
DESCRIPTION = "Development package to build Qt-based compositors."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde51"

RPM_NAME = "libqt5-qtwayland-devel-5.15.10+kde51-1.1.aarch64.rpm"
RPM_HASH = "eec0e4ee997ea4162f8e1f3d01c2d0ee35dca546800ad39e0a20ec69867fcd03f806f03f70e91c9d10f3cf1736debec1551e1fad6da6bbfb7f811bfc65c126d0"

RPROVIDES:${PN} += "cmake-Qt5WaylandClient \
cmake-Qt5WaylandCompositor \
libqt5-qtwayland-devel \
pkgconfig-Qt5WaylandClient \
pkgconfig-Qt5WaylandCompositor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5WaylandClient5 \
libQt5WaylandCompositor5 \
libqt5-qtwayland \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml \
pkgconfig-Qt5Quick"

inherit rpm
