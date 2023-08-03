SUMMARY = "Qt 6 Quick3DEffects library"
DESCRIPTION = "The Qt 6 Quick3DEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3DEffects6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e1d303292daeeb7b48f7b0485c238df6be848e3b04ee4ca1e2d4429fb5579ed5cc2aa177b3fc3d0796f82c742066be4e8c2e9ff2b3540927ce5122429ed2181d"

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
