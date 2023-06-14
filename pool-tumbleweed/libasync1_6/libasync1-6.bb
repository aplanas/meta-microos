SUMMARY = "SvxLink Async libs"
DESCRIPTION = "The Async library files."
LICENSE = "GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "libasync1_6-1.4.0-5.9.aarch64.rpm"
RPM_HASH = "1fa55e86a194ed45751177afb0ad7a1c1f2c73aa407036f92a2c6791a6bd76880df061d558962417d94a7dec78dd84a83631fab49ba97f8e1cff8bd033809fe9"

RPROVIDES:${PN} += "libasync1-6 \
libasyncaudio.so.1.6 \
libasynccore.so.1.6 \
libasynccpp.so.1.6 \
libasyncqt.so.1.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libgsm.so.1 \
libm.so.6 \
libopus.so.0 \
libsigc-2.0.so.0 \
libspeex.so.1 \
libstdc++.so.6"

inherit rpm
