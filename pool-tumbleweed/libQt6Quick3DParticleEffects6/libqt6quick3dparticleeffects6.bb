SUMMARY = "Qt 6 Quick3DParticleEffects library"
DESCRIPTION = "The Qt 6 Quick3DParticleEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DParticleEffects6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "5ed62381c7486adb1eb44819b44b183bd32a58dd33b8388d576b9d1f4206d333bb77d179d003b7a20e919d8d5a5a119dcf2be23bdf30af2c38d557d11fa9a957"

RPROVIDES:${PN} += "libQt6Quick3DParticleEffects.so.6 \
libQt6Quick3DParticleEffects6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6"

inherit rpm
