SUMMARY = "A program to unpack compressed files"
DESCRIPTION = "UnZip is an extraction utility for archives compressed in .zip format \
(known as 'zip files').  Although highly compatible both with PKWARE's \
PKZIP(tm) and PKUNZIP utilities for MS-DOS and with Info-ZIP's own Zip \
program, our primary objectives have been portability and non-MS-DOS \
functionality. This version can also extract encrypted archives."
LICENSE = "BSD-3-Clause"

PV = "6.00"

RPM_NAME = "unzip-rcc-6.00-41.4.aarch64.rpm"
RPM_HASH = "3aa5934763a830ea6f82777e2e19fe7268de7508f87c9f8baa03d67c82a106a35ad8b927c2aaa74ab7a0b52366e75d36245a4a1e3f2e4aabc4ac9dfdee944e7b"

RPROVIDES:${PN} += "unzip \
unzip-rcc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
