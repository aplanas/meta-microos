SUMMARY = "A C++ Library for Parsing Expressions"
DESCRIPTION = "The muparserx shared library. A C++ Library for Parsing Expressions with \
Strings, Complex Numbers, Vectors, Matrices and more."
LICENSE = "BSD-2-Clause"

PV = "4.0.12"

RPM_NAME = "libmuparserx4_0_12-4.0.12-1.3.aarch64.rpm"
RPM_HASH = "3ab82f30e8838a73f704a7968906479e2544ab5fc43ff8da58b812065cac748f42f13dcaa2be5077f019329de257aa485b3d03d5541b549731c6814e79ba4bc5"

RPROVIDES:${PN} += "libmuparserx.so.4.0.12 \
libmuparserx4-0-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
