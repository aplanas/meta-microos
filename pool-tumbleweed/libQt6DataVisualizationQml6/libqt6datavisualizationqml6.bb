SUMMARY = "Qt 6 DataVisualizationQml library"
DESCRIPTION = "The Qt 6 DataVisualizationQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6DataVisualizationQml6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0f342d2d3159ea18f86408ba9911f58396242413609050a97d84b2c7993b6da3ed884163f7a33447552d75079afefc44aea512c1ac5e3a4ca0a4b2bd3f55306a"

RPROVIDES:${PN} += "libQt6DataVisualizationQml.so.6()(64bit) \
libQt6DataVisualizationQml.so.6(Qt_6)(64bit) \
libQt6DataVisualizationQml.so.6(Qt_6.0)(64bit) \
libQt6DataVisualizationQml.so.6(Qt_6.1)(64bit) \
libQt6DataVisualizationQml.so.6(Qt_6.2)(64bit) \
libQt6DataVisualizationQml.so.6(Qt_6.3)(64bit) \
libQt6DataVisualizationQml.so.6(Qt_6.4)(64bit) \
libQt6DataVisualizationQml.so.6(Qt_6.5)(64bit) \
libQt6DataVisualizationQml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6DataVisualizationQml6 \
libQt6DataVisualizationQml6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6DataVisualization.so.6()(64bit) \
libQt6DataVisualization.so.6(Qt_6)(64bit) \
libQt6DataVisualization.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
