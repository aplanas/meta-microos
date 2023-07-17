SUMMARY = "Qt 6 DataVisualizationQml library"
DESCRIPTION = "The Qt 6 DataVisualizationQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6DataVisualizationQml6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4ec878b1ad97a8f175bb3bd056b6d4668dbbd8298404cdae727378f0074a0b1886216cfbfec602de247f4aaa4f326d3c92231e29933b1078d79168b7d27a1111"

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
