SUMMARY = "Qt 6 Help library - Development files"
DESCRIPTION = "Development files for the Qt6 Help library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-help-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "55c14a76cfa521599412aab0c95290a27a51c7535982ff3843f91a730d28c53e5b5ea3ca127aacec4c0208a8bf64eb9af199d33d3a7447c5359a5e6d5f8f9200"

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
