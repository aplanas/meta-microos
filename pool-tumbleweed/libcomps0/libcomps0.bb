SUMMARY = "Libraries for libcomps"
DESCRIPTION = "Libraries for libcomps"
LICENSE = "GPL-2.0-or-later"

PV = "0.1.19"

RPM_NAME = "libcomps0-0.1.19-2.4.aarch64.rpm"
RPM_HASH = "e6d46b4580e141ee444480ef4f00ad9e9ab48b39a3d4f3db0f988c313b4614259b6ea7d50e511ce541bde2c6462487e7de070efff2ef7ba4baf7ffe4590a025b"

RPROVIDES:${PN} += "libcomps.so.0 \
libcomps0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libm.so.6 \
libxml2.so.2"

inherit rpm
