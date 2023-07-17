SUMMARY = "Qt 6 Quick3DEffects library"
DESCRIPTION = "The Qt 6 Quick3DEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DEffects6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "79326d3e6daed06c92561169852aa04af7afad94f0b6515b8f92e1f8ad02cbfd889ebe7fdb19a26b5669210dc2e069360177b53756cfb418cbd7250c6bc7e510"

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
