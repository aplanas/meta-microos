SUMMARY = "A program to unpack compressed files"
DESCRIPTION = "UnZip is an extraction utility for archives compressed in .zip format \
(known as 'zip files').  Although highly compatible both with PKWARE's \
PKZIP(tm) and PKUNZIP utilities for MS-DOS and with Info-ZIP's own Zip \
program, our primary objectives have been portability and non-MS-DOS \
functionality. This version can also extract encrypted archives."
LICENSE = "BSD-3-Clause"

PV = "6.00"

RPM_NAME = "unzip-6.00-41.4.aarch64.rpm"
RPM_HASH = "f44cc763f67c326f0601eb6b02206465c788ecc01ae331da6511c4dbdf371a5179942d100092241880eeb7f2f710b33a0bd9cd1e3823ba46b286e17951b2543d"

RPROVIDES:${PN} += "unzip"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
