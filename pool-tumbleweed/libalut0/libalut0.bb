SUMMARY = "freealut is a free implementation of OpenAL's ALUT standard"
DESCRIPTION = "freealut is a free implementation of OpenAL's ALUT standard."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libalut0-1.1.0-237.20.aarch64.rpm"
RPM_HASH = "32d410292f84ac71e958fda0376ba0667ae9afcc269319a7016e3bbb5ca23f768c3284a34c20dc06847a5ba3bf88350302b5c91bc62f32b5656025794499272b"

RPROVIDES:${PN} += "libalut.so.0 \
libalut0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libopenal.so.1"

inherit rpm
