SUMMARY = "Qt 6 Quick3DParticleEffects library"
DESCRIPTION = "The Qt 6 Quick3DParticleEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DParticleEffects6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "9a38154a2e8e652761f206690510a793d843f3692892e1f2c4a90ce8cba4d8600086b1d1e41726404b5f0c85151d4389e093fd7223caad1986a7c6081fc3ff31"

RPROVIDES:${PN} += "libQt6Quick3DParticleEffects.so.6 \
libQt6Quick3DParticleEffects6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6"

inherit rpm
