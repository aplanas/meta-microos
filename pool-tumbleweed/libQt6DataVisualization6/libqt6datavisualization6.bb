SUMMARY = "Qt 6 DataVisualization library"
DESCRIPTION = "The Qt 6 DataVisualization library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6DataVisualization6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "8eef38648bc95590230daf072c13507b2bfee85002f231ef8401afb18803f0d7f6568a12ec943c665bd0a008602b999de0404fc56d25c11009d8b8eb312aeb6c"

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
