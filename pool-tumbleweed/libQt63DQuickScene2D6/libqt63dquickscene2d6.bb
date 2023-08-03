SUMMARY = "Qt 6 3DQuickScene2D library"
DESCRIPTION = "The Qt 6 3DQuickScene2D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt63DQuickScene2D6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "848b84eb1b71b19787ec7c5b989c875b5eaa1c7b5d3d8578f1647516ef2e3715094f01b8f3c0ac1f58d1d36dd339e3603e0e3ec870b21451ff23b1218fd09f8b"

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
