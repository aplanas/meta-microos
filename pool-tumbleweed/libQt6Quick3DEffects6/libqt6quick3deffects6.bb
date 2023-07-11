SUMMARY = "Qt 6 Quick3DEffects library"
DESCRIPTION = "The Qt 6 Quick3DEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DEffects6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "62bba92b23a8a9b8d1d0dcb9b5f8d641e0bd793c3ed4f6f9b52bcf66fd1bd1f40461c7d42425cd659cefcc6dbda44e01f9854a815c7391600417802e2dcc3f54"

RPROVIDES:${PN} += "libQt6Quick3DEffects.so.6 \
libQt6Quick3DEffects6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
