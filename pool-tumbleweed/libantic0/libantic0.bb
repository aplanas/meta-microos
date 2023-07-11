SUMMARY = "Algebraic Number Theory library in C"
DESCRIPTION = "Antic is an algebraic number theory library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.5"

RPM_NAME = "libantic0-0.2.5-2.2.aarch64.rpm"
RPM_HASH = "70392c5af347e367f526ac56942d1ca2ced2778f71d0f8f393c1cd62dca7de6feda63f21c46a4b2fa99d595656f68eaf35af4f4b3f5853144777f5758f0e222e"

RPROVIDES:${PN} += "libantic.so.0 \
libantic0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflint.so.17 \
libgmp.so.10 \
libmpfr.so.6"

inherit rpm
