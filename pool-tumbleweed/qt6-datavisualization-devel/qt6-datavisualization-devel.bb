SUMMARY = "Qt 6 DataVisualization library - Development files"
DESCRIPTION = "Development files for the Qt 6 DataVisualization library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-datavisualization-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8f30ea73a011752238e5941fe668d4692edd950bceb70172a985a6abdcb0dd56bdb87b9936de98b4dc0a9a56cc4745514001ec22ec396cbee5fe89e8d8b63731"

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
