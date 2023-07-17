SUMMARY = "Qt 6 Quick3D library"
DESCRIPTION = "The Qt 6 Quick3D library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3D6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "7c290792fb4c64215408f5b9b5644c908040833e29951e53b19aee7b1701d079ede444557d220718255d5a106652bdef26c0b61fdfcddfb5ddce42df169d5408"

RPROVIDES:${PN} += "libQt6Quick3D.so.6 \
libQt6Quick3D6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libQt6Quick.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DUtils.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
