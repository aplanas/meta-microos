SUMMARY = "Qt 6 Quick3DPhysics library"
DESCRIPTION = "The Qt 6 Quick3DPhysics library."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DPhysics6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "9bc076aae61f23ae893f5a1c5a750b9c3f75d54cfd5129eeb0a6774865336fa6d1052d73c1f88db11eaad9e70a3f2a5a72404d8e086795df87c0674a6dc906bf"

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
