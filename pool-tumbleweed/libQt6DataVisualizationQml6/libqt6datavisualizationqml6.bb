SUMMARY = "Qt 6 DataVisualizationQml library"
DESCRIPTION = "The Qt 6 DataVisualizationQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6DataVisualizationQml6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c4472dfb4127050b5177e62fd92de5a87e86ba1f536151312756aa74385938ce754f464909346308039c81e4b2a34dd6a73412b749ccdc53541d08afff75b56e"

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
