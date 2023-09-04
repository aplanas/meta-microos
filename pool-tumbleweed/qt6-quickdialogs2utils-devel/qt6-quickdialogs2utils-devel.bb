SUMMARY = "Qt6 QuickDialogs2Utils library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2Utils library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickdialogs2utils-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "7a1099401eb802b22e7de06fbcd232c1d37bfaf7857135a8d3dd016d8d7481eec1a7f1126fa5ce10d449d9f572ec14520851a98611180b828ae1f3675bc2cab2"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2Utils \
pkgconfig-Qt6QuickDialogs2Utils \
qt6-quickdialogs2utils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6QuickDialogs2Utils6 \
pkgconfig-Qt6Core"

inherit rpm
