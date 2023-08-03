SUMMARY = "Qt 6 Quick3DPhysics library"
DESCRIPTION = "The Qt 6 Quick3DPhysics library."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3DPhysics6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "30d31b6c24a981fc72bceb9b07184992d7469445d6fbb3ebaf1b755bfbeb0e727da93cff9da6e3d4aebaab9e9ac555b6b2cfb4fafa8259d295db86d812081c92"

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
