SUMMARY = "Qt 6 DataVisualizationQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 DataVisualizationQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualizationqml-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "34eafd7186058661fe6d0f40305efe8cdaf17a8fc1e236b0003a7a70af59f2d054f08454123afe612ae825ddf27510b319252337c66f3cda85d406398d25c6e9"

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
