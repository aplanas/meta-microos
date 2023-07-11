SUMMARY = "Qt 6 Quick3DParticles library"
DESCRIPTION = "The Qt 6 Quick3DParticles library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DParticles6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "9f14d0f544db009e11f37b7cb4328051c64cd4e69825865973dac844f1c06ac4c007ec4dcedeef5ce25590f54a50db1d02895e8bf0062e6c46a303f646c1fdf7"

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
