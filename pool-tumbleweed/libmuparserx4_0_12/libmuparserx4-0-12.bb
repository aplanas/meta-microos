SUMMARY = "A C++ Library for Parsing Expressions"
DESCRIPTION = "The muparserx shared library. A C++ Library for Parsing Expressions with \
Strings, Complex Numbers, Vectors, Matrices and more."
LICENSE = "BSD-2-Clause"

PV = "4.0.12"

RPM_NAME = "libmuparserx4_0_12-4.0.12-1.4.aarch64.rpm"
RPM_HASH = "ac908c3e771328d85ea928309f974fede669a273a834dca483569329b647badd6834052f33226105d9b930e28c1cee297261f58d3e05f40da032b4a70f4cdfbd"

RPROVIDES:${PN} += "libmuparserx.so.4.0.12 \
libmuparserx4-0-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
