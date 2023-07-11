SUMMARY = "Qt 6 DataVisualization library - Development files"
DESCRIPTION = "Development files for the Qt 6 DataVisualization library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualization-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "2f9460ed2d45247357d88d6b6b2b5dc2c6cfff9360097b6b58de5d6e21481841059ce1aef2c51b3a20baaf7fb09a6f468de8a263dea1df162c5fc8aa34d76f9a"

RPROVIDES:${PN} += "cmake-Qt6DataVisualization \
pkgconfig-Qt6DataVisualization \
qt6-datavisualization-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6DataVisualization6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGL"

inherit rpm
