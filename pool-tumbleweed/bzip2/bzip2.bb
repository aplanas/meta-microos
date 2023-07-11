SUMMARY = "A Program for Compressing Files"
DESCRIPTION = "The bzip2 program is a program for compressing files."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "bzip2-1.0.8-5.5.aarch64.rpm"
RPM_HASH = "09f1f47719ef390e69edb5221c6fc3e113af5000d50282eca4c3be8cd56d5cec7302509922fb92aa0daf46da72dda44c2cea98222d80f9a7fd640af3c1d2d4f8"

RPROVIDES:${PN} += "bzip \
bzip2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2-1 \
libbz2.so.1 \
libc.so.6"

inherit rpm
