SUMMARY = "SvxLink Async libs"
DESCRIPTION = "The Async library files."
LICENSE = "GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "libasync1_6-1.4.0-5.9.aarch64.rpm"
RPM_HASH = "1fa55e86a194ed45751177afb0ad7a1c1f2c73aa407036f92a2c6791a6bd76880df061d558962417d94a7dec78dd84a83631fab49ba97f8e1cff8bd033809fe9"

RPROVIDES:${PN} += "libasync1_6 \
libasync1_6(aarch-64) \
libasyncaudio.so.1.6()(64bit) \
libasynccore.so.1.6()(64bit) \
libasynccpp.so.1.6()(64bit) \
libasyncqt.so.1.6()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgsm.so.1()(64bit) \
libm.so.6()(64bit) \
libopus.so.0()(64bit) \
libsigc-2.0.so.0()(64bit) \
libspeex.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
