SUMMARY = "Qt 6 DataVisualization library"
DESCRIPTION = "The Qt 6 DataVisualization library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6DataVisualization6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f1b8d6ed4dccf1fa461b4cfface174bc3c71cd2f679fa0a903f6699b92066af051cc2ac48a59ca995985c0e3192c699a1577ee44885709cd64829d5ddb37ab0c"

RPROVIDES:${PN} += "libQt6DataVisualization.so.6 \
libQt6DataVisualization6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
