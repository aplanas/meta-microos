SUMMARY = "Qt 6 Quick3DParticleEffects library"
DESCRIPTION = "The Qt 6 Quick3DParticleEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3DParticleEffects6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6c79292b56ef2d563d4d7aca436e561568ac894f7057d221f2a7dc75ff714abf2d81ffe825b8f2e63c1212eb50749346c765ecac332a9963846b148637b879dd"

RPROVIDES:${PN} += "libQt6Quick3DParticleEffects.so.6 \
libQt6Quick3DParticleEffects6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6"

inherit rpm
