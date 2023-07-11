SUMMARY = "Qt 6 Help library - Development files"
DESCRIPTION = "Development files for the Qt6 Help library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-help-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "5f4d6c05fcc30049131c1c386655aa76b1f04de482e9d2b9bd25940731cb6e754abb806662218da5728e884862c81e717a1fc5755bb8e9c1eaddba426a044af2"

RPROVIDES:${PN} += "cmake-Qt6Help \
pkgconfig-Qt6Help \
qt6-help-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6Sql \
cmake-Qt6Widgets \
libQt6Help6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Sql \
pkgconfig-Qt6Widgets"

inherit rpm
