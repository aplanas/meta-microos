SUMMARY = "Qt 6 Quick3DParticles library"
DESCRIPTION = "The Qt 6 Quick3DParticles library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DParticles6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "9a64896c2e0569baa5d7068099bb23b7f1c8ca54cace19ed57a7407fad25a9ce4823e139819f01ca20facda655e23a18dd28558c3bb73bdc6ac89482cce77d72"

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
