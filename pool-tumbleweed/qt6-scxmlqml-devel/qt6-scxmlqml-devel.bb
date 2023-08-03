SUMMARY = "Qt 6 ScxmlQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 ScxmlQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-scxmlqml-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "43b636a8f9e1f5ca84d792a095026d3ab1d23734281c3e8bd9214bf18b64343d63d16e9ee38b40e6ff4261ec3f06966fe26fee18b7dc1b310f3ad950321ca83f"

RPROVIDES:${PN} += "cmake-Qt6ScxmlQml \
pkgconfig-Qt6ScxmlQml \
qt6-scxmlqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Scxml \
libQt6ScxmlQml6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Scxml"

inherit rpm
