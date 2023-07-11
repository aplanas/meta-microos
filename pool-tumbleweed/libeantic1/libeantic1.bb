SUMMARY = "Real Embedded Algebraic Number Theory library in C"
DESCRIPTION = "E-ANTIC is a C/C++ library to deal with real embedded number fields \
built on top of ANTIC."
LICENSE = "LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "libeantic1-1.3.0-1.6.aarch64.rpm"
RPM_HASH = "a139dea119169495a74c2c2e0d8ede3a0eccc1b59401a6a3b3e3982160170b21bbe764e67422a0b7a320a46aeb81d3a64b5a583ade1d4cba8e43ab081a44412f"

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
