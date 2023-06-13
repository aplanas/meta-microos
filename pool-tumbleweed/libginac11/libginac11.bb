SUMMARY = "C++ library for symbolic calculations"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language."
LICENSE = "GPL-2.0-only"

PV = "1.8.5"

RPM_NAME = "libginac11-1.8.5-2.3.aarch64.rpm"
RPM_HASH = "f72833fd409fa996bdf592497ef23d1c73254cf8daa65e434d36586d5257537278ae32a301e6b1b2e4668a3c8ec9f81a62a61a73f9fdb569b4d3c8fe6b36611c"

RPROVIDES:${PN} += "libginac.so.11()(64bit) \
libginac11 \
libginac11(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcln.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
