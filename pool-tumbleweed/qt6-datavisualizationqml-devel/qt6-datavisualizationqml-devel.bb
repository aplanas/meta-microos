SUMMARY = "Qt 6 DataVisualizationQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 DataVisualizationQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-datavisualizationqml-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ba353f02007ac036717688fee3c7b8f2006d962b205952fa5722e398b02e69eb0c6456697d2bcd5998621f4242b557a0ee2df1e820758b2756fd1b95675f63bb"

RPROVIDES:${PN} += "cmake-Qt6DataVisualizationQml \
pkgconfig-Qt6DataVisualizationQml \
qt6-datavisualizationqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6DataVisualization \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6DataVisualizationQml6"

inherit rpm
