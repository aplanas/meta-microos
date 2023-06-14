SUMMARY = "A program to unpack compressed files"
DESCRIPTION = "UnZip is an extraction utility for archives compressed in .zip format \
(known as 'zip files').  Although highly compatible both with PKWARE's \
PKZIP(tm) and PKUNZIP utilities for MS-DOS and with Info-ZIP's own Zip \
program, our primary objectives have been portability and non-MS-DOS \
functionality. This version can also extract encrypted archives."
LICENSE = "BSD-3-Clause"

PV = "6.00"

RPM_NAME = "unzip-6.00-41.3.aarch64.rpm"
RPM_HASH = "a557c0aa696e9062bceb2a285e63f3dd44fd1c726381dbab5162802ef7c4c5bff40f7178ebee3c45828819928260edd83687fcdea38ba498ae5d3f5dc130c0fb"

RPROVIDES:${PN} += "unzip"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
