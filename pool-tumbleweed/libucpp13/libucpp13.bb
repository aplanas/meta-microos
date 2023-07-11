SUMMARY = "A Mixed Integer Linear Programming (MILP) Solver Library"
DESCRIPTION = "ucpp is a preprocessor for C source code, specifically code compliant to the \
ISO standard 9899:1999, also known as C99. A preprocessor is responsible for \
macro replacement, conditional compilation and inclusion of header files. \
 \
ucpp, built as a library, outputs tokens, one at a time, on demand, \
as an integrated lexer."
LICENSE = "BSD-3-Clause"

PV = "1.3.5"

RPM_NAME = "libucpp13-1.3.5-2.19.aarch64.rpm"
RPM_HASH = "edca0fe10ebdf918d08ba45790506e48b90fc05b54c1217af678f2269548f8192dc674744708106a3ff1124acee6b9e791ef4e1b01d98bcebb9c4831bc6c7096"

RPROVIDES:${PN} += "libucpp.so.13 \
libucpp13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
