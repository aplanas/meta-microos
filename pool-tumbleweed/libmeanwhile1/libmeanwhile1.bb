SUMMARY = "IBM Sametime Community Client Library"
DESCRIPTION = "A library to establish instant messaging connections to the IBM \
Sametime IM server."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libmeanwhile1-1.1.1-1.17.aarch64.rpm"
RPM_HASH = "e97239c7f6259b04f51545edf0de285983c0b59d738c124e8cd779b4b41b27afaa332bb123d1e0fe195e687b780e047f78f73507e15df2e1e7ae65f0d27c7fd7"

RPROVIDES:${PN} += "libmeanwhile \
libmeanwhile.so.1 \
libmeanwhile1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libtommath.so.1"

inherit rpm
