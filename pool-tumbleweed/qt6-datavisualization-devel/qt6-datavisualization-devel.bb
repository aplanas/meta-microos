SUMMARY = "Qt 6 DataVisualization library - Development files"
DESCRIPTION = "Development files for the Qt 6 DataVisualization library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualization-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "5854be0f183f3d4826417964b3157c4ce8c54c2704aaf89c75c2d3c24a455093ec0433b024182fa4f88fa26046ef54bccf52d8175ff5c23ffd5b8a34fffee144"

RPROVIDES:${PN} += "cmake(Qt6DataVisualization) \
pkgconfig(Qt6DataVisualization) \
qt6-datavisualization-devel \
qt6-datavisualization-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Gui) \
cmake(Qt6OpenGL) \
cmake(Qt6Qml) \
cmake(Qt6Quick) \
libQt6DataVisualization6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6OpenGL)"

inherit rpm
