SUMMARY = "Qt 6 3DQuickScene2D library"
DESCRIPTION = "The Qt 6 3DQuickScene2D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DQuickScene2D6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e0587b3fb0e78bb37e052b0ff90833468e37c68651ca4736871dc9df49b2a336590e0112fbe54697b9627f331241c732deadb2887b2485a9c6bda3fe5c96cc7d"

RPROVIDES:${PN} += "libQt63DQuickScene2D.so.6 \
libQt63DQuickScene2D6 \
libscene2d.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
