SUMMARY = "A program to unpack compressed files"
DESCRIPTION = "UnZip is an extraction utility for archives compressed in .zip format \
(known as 'zip files').  Although highly compatible both with PKWARE's \
PKZIP(tm) and PKUNZIP utilities for MS-DOS and with Info-ZIP's own Zip \
program, our primary objectives have been portability and non-MS-DOS \
functionality. This version can also extract encrypted archives."
LICENSE = "BSD-3-Clause"

PV = "6.00"

RPM_NAME = "unzip-rcc-6.00-41.3.aarch64.rpm"
RPM_HASH = "891e9294e26ce6fa7f2a94041227a890a3ec6d9483fa9daecd1b4a7021ced5b263bcd88e14c825fcbc6d56ecca206630d3dac24c8d97db00d66b0b8d5e696a2c"

RPROVIDES:${PN} += "unzip \
unzip-rcc"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
