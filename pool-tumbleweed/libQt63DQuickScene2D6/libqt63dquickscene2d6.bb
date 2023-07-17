SUMMARY = "Qt 6 3DQuickScene2D library"
DESCRIPTION = "The Qt 6 3DQuickScene2D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DQuickScene2D6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e5f04ceb86f3dd5de384dc6f24fd6286bb33de82f24b034d76f29e11b68dbd3fbcde251cc460764d21d514ab7e3be5308467ac5a7b7b77ad6a82d838310edb46"

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
