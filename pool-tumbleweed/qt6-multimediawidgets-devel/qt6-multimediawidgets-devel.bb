SUMMARY = "Qt 6 MultimediaWidgets library - Development files"
DESCRIPTION = "Development files for the Qt 6 MultimediaWidgets library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimediawidgets-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3fdb464e9ba2ced346a11b086a13642e2ff93458966bf24eb0c5e4928d6ce2252171bbd49deb000c425129a42880e9699e258e3adcd7313c98be14ae176d2036"

RPROVIDES:${PN} += "cmake-Qt6MultimediaWidgets \
pkgconfig-Qt6MultimediaWidgets \
qt6-multimediawidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Multimedia \
cmake-Qt6Widgets \
libQt6MultimediaWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Multimedia \
pkgconfig-Qt6Widgets"

inherit rpm
