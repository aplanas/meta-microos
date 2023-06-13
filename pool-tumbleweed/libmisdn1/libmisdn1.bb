SUMMARY = "mISDN core library"
DESCRIPTION = "The mISDN core library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.1.0+2.0.22+git6"

RPM_NAME = "libmisdn1-2.1.0+2.0.22+git6-2.6.aarch64.rpm"
RPM_HASH = "9af569619c3c4f7a04189f975e31909fcdfe40b1f3396cfc565dcd88448133f357575e34f5dea8de7860b1e983a2c1266baa6999a11fa0afcfd52c5e939f76f9"

RPROVIDES:${PN} += "libmisdn.so.1()(64bit) \
libmisdn1 \
libmisdn1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
