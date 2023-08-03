SUMMARY = "Qt 6 MultimediaWidgets library - Development files"
DESCRIPTION = "Development files for the Qt 6 MultimediaWidgets library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-multimediawidgets-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1ec607ed0a295c6e26a37699877541233febce1ce32e021130eba2d1de88239d9df561fcac3c8506f2c8e76e8f34fa7489e201bfe1006e30240d119a7dd49f18"

RPROVIDES:${PN} += "cmake-Qt6MultimediaWidgets \
pkgconfig-Qt6MultimediaWidgets \
qt6-multimediawidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Multimedia \
cmake-Qt6Widgets \
libQt6MultimediaWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Multimedia \
pkgconfig-Qt6Widgets"

inherit rpm
