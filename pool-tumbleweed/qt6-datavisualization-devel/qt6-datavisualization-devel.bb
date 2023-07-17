SUMMARY = "Qt 6 DataVisualization library - Development files"
DESCRIPTION = "Development files for the Qt 6 DataVisualization library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualization-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "0efbf722b4c24c9763da8aa673875412928d2aa42312a1bb9a2795a2534ac2a69d13afcf5c7f22d94064f4d122ed632012c23c1e8356e4c490d48b305faf1b43"

RPROVIDES:${PN} += "cmake-Qt6DataVisualization \
pkgconfig-Qt6DataVisualization \
qt6-datavisualization-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
libQt6DataVisualization6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGL"

inherit rpm
