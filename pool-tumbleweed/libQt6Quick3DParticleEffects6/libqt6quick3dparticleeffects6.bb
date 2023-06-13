SUMMARY = "Qt 6 Quick3DParticleEffects library"
DESCRIPTION = "The Qt 6 Quick3DParticleEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DParticleEffects6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "df1f38934ca1ca629c105e7c43804ca891e04cf958d6f5a4c4d3efe80069c0363dd18d812d0aad1b06bc654bfa96ba7a3d063ccad8c558480649652bb103f855"

RPROVIDES:${PN} += "libQt6Quick3DParticleEffects.so.6()(64bit) \
libQt6Quick3DParticleEffects6 \
libQt6Quick3DParticleEffects6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libc.so.6()(64bit)"

inherit rpm
