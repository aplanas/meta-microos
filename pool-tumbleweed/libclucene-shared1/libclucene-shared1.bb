SUMMARY = "CLucene cross-platform layer"
DESCRIPTION = "This package creates a library that is used in all the CLucene \
projects. It provides cross-platform macros and functions, as well as \
things like cl_* string macros, file handling functions, replacement \
functions, etc."
LICENSE = "Apache-2.0 | LGPL-2.1-only"

PV = "2.3.3.4"

RPM_NAME = "libclucene-shared1-2.3.3.4-18.6.aarch64.rpm"
RPM_HASH = "eb03172f2b4cb6f67f53aa2aef0b9dabe457bdd0d109c7253a601da6cd9993a66c1bca91f37037973bdf7f20b0f1101704cf45c89b59d14d467444fff2a6f019"

RPROVIDES:${PN} += "libclucene-shared.so.1 \
libclucene-shared1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
