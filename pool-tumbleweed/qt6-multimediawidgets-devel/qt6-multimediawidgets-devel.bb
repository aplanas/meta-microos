SUMMARY = "Qt 6 MultimediaWidgets library - Development files"
DESCRIPTION = "Development files for the Qt 6 MultimediaWidgets library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimediawidgets-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4b3131b9cca60f5da441ae64242236f2e221a58dd478cbdada023b3139875450598d75514cee0d80be0616390d85412a1c9a42d9c2bd3f184040e27e896225b7"

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
