SUMMARY = "Qt 6 Quick3DParticles library"
DESCRIPTION = "The Qt 6 Quick3DParticles library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3DParticles6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4d993e313fb6525416059cf011528fd5d463e9933f54487dcb5300370f575336ec0d5eca0d3df4569695ea9d8ac0b066b7f3bf7ca6ba71d89aacc630b56bcdf3"

RPROVIDES:${PN} += "libQt6Quick3DParticles.so.6 \
libQt6Quick3DParticles6"

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
