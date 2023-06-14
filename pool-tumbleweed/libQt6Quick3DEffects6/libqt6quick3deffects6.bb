SUMMARY = "Qt 6 Quick3DEffects library"
DESCRIPTION = "The Qt 6 Quick3DEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DEffects6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "29b99a41a18d4514227144e0354f08788014237cb98259e3ed1585e6f0fc09d2e03cbc7d4fa3d08af3721679244cd00beff970589c79940c306b8ad57a327251"

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
