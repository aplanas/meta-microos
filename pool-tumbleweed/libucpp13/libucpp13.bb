SUMMARY = "A Mixed Integer Linear Programming (MILP) Solver Library"
DESCRIPTION = "ucpp is a preprocessor for C source code, specifically code compliant to the \
ISO standard 9899:1999, also known as C99. A preprocessor is responsible for \
macro replacement, conditional compilation and inclusion of header files. \
 \
ucpp, built as a library, outputs tokens, one at a time, on demand, \
as an integrated lexer."
LICENSE = "BSD-3-Clause"

PV = "1.3.5"

RPM_NAME = "libucpp13-1.3.5-2.18.aarch64.rpm"
RPM_HASH = "9b729b58b040e1cef78a20abd9a0c0b021b98bc84402f6a2704b9fa7b811ef3391a49d471f4dc96a7608753aae977ab16f41e374e9a59f73dade3d391cb73d46"

RPROVIDES:${PN} += "libucpp.so.13()(64bit) \
libucpp13 \
libucpp13(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
