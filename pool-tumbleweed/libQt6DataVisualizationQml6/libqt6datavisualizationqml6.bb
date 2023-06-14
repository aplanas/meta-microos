SUMMARY = "Qt 6 DataVisualizationQml library"
DESCRIPTION = "The Qt 6 DataVisualizationQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6DataVisualizationQml6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0f342d2d3159ea18f86408ba9911f58396242413609050a97d84b2c7993b6da3ed884163f7a33447552d75079afefc44aea512c1ac5e3a4ca0a4b2bd3f55306a"

RPROVIDES:${PN} += "libQt6DataVisualizationQml.so.6 \
libQt6DataVisualizationQml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DataVisualization.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
