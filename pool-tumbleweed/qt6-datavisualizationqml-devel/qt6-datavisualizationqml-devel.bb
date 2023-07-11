SUMMARY = "Qt 6 DataVisualizationQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 DataVisualizationQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualizationqml-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "d1539ed946e075efc6f50cefe924aba18d0cd9e5a880c21469d0cca9e77b1023cee562cb485f1275f5786e725c07bb2bd6dc7a01cd550811989f686d6f05e2f7"

RPROVIDES:${PN} += "cmake-Qt6DataVisualizationQml \
pkgconfig-Qt6DataVisualizationQml \
qt6-datavisualizationqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6DataVisualizationQml6 \
qt6-datavisualization-private-devel"

inherit rpm
