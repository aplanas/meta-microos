SUMMARY = "SvxLink Async libs"
DESCRIPTION = "The Async library files."
LICENSE = "GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "libasync1_6-1.4.0-5.10.aarch64.rpm"
RPM_HASH = "ea30234d2e33b3ed2ffa919be636e514320ecf00e544e21a943657f43a100cb2811775360448bb48a92ab05a858880ebc00d9098959bfaf8701ebf303681663e"

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
