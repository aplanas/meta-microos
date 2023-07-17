SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libblkid1-2.39-2.1.aarch64.rpm"
RPM_HASH = "eece029dedb92e01319a7cdb7b44cf9d678be2779e4d343522444c11d48160aa46822a3e9ad757d1fb2f60b28ecb9135a79263a7f4e2edb1a258f633d6efbb80"

RPROVIDES:${PN} += "libblkid.so.1 \
libblkid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
