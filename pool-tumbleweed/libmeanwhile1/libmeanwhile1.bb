SUMMARY = "IBM Sametime Community Client Library"
DESCRIPTION = "A library to establish instant messaging connections to the IBM \
Sametime IM server."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libmeanwhile1-1.1.1-1.16.aarch64.rpm"
RPM_HASH = "5429df7def61031535593a6d692fd936f196b8d4e3e5e2b54c5673cf2bd9e7c7846743f181cc7a4e28ea04ce43fed2ef4a3d39e6d9a0800c74cef20766417e2c"

RPROVIDES:${PN} += "libmeanwhile \
libmeanwhile.so.1 \
libmeanwhile1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libtommath.so.1"

inherit rpm
