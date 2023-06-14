SUMMARY = "Qt 6 Quick3DPhysics library"
DESCRIPTION = "The Qt 6 Quick3DPhysics library."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DPhysics6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "bd99d21076cacdba865514b58ede4b9b57d7e6f434c3655b341ea1851f76b7885ff530515a34539c5e7b28b0dfddc91a87f8d3ac54e717102b9c0b288d5614a3"

RPROVIDES:${PN} += "libQt6Quick3DPhysics.so.6 \
libQt6Quick3DPhysics6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick3D.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DUtils.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
