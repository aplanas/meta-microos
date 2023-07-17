SUMMARY = "Qt 6 QuickControls2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickControls2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrols2-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "9c3eac8d6a012dcab9b580be2f82c9156399da8377869d95ce7393e5d16757cc7e593e88fdd08a2d836a15c49aa1ecbcf0da112052426a3af7d37ecb16c56bca"

RPROVIDES:${PN} += "cmake-Qt6QuickControls2 \
pkgconfig-Qt6QuickControls2 \
qt6-quickcontrols2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickTemplates2 \
libQt6QuickControls2-6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick"

inherit rpm
