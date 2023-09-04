SUMMARY = "Qt6 QuickDialogs2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2 library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickdialogs2-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "ebe0bb6ece2a2ce826b082e4ceba2b671bc1585136d50cb51c50c3927b511761f71e7a234c8d5368ee5f0d1a05036ec40d9838866d6023dbeecd7c897c1644ce"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2 \
pkgconfig-Qt6QuickDialogs2 \
qt6-quickdialogs2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickControls2Impl \
cmake-Qt6QuickDialogs2QuickImpl \
cmake-Qt6QuickDialogs2Utils \
libQt6QuickDialogs2-6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick"

inherit rpm
