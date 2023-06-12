SUMMARY = "Library for C generic data functions"
DESCRIPTION = "A library for C generic data functions. \
 \
This subpackage contains the actual shared object library"
LICENSE = "LGPL-3.0-or-later"

PV = "20230108"

RPM_NAME = "libcdata1-20230108-1.2.aarch64.rpm"
RPM_HASH = "ab714055db993cd55c4f0c43e099570cea3abf0c54e5786db80029579b5df85a249e4def6ec9a37c6af1f1392c90f3367f75a45ae0959af527ae233a907f55c1"

RPROVIDES:${PN} += "libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcdata1 \
libcdata1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit)"

inherit rpm