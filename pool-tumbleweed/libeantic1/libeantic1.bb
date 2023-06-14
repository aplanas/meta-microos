SUMMARY = "Real Embedded Algebraic Number Theory library in C"
DESCRIPTION = "E-ANTIC is a C/C++ library to deal with real embedded number fields \
built on top of ANTIC."
LICENSE = "LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "libeantic1-1.3.0-1.5.aarch64.rpm"
RPM_HASH = "c8e6af4e5633af9a210e95921f120259c9ab5f89145dcaa69287e2508bbcf63e9042f9236161165f05a986687869483047a800c392e6ceeec4d14dccdccca1cb"

RPROVIDES:${PN} += "libeantic.so.1 \
libeantic1 \
libeanticxx.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libantic.so.0 \
libarb.so.2 \
libc.so.6 \
libflint.so.17 \
libgcc-s.so.1 \
libgmp.so.10 \
libstdc++.so.6"

inherit rpm
