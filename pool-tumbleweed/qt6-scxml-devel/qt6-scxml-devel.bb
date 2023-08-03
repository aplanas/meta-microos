SUMMARY = "Qt 6 Scxml library - Development files"
DESCRIPTION = "Development files for the Qt 6 Scxml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-scxml-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e39fd08edf5d7ecbadfb75c85b46a8ce54cd2b5e8eb08d3937a13f25b15d990d7e6ce0a9ec9a4f2969918659c04d6e21280b5e12e16c2f3417a1a5cf9179d4a2"

RPROVIDES:${PN} += "cmake-Qt6Scxml \
cmake-Qt6ScxmlTools \
pkgconfig-Qt6Scxml \
qt6-scxml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Qml \
libQt6Scxml6 \
pkgconfig-Qt6Core \
qt6-scxml"

inherit rpm
