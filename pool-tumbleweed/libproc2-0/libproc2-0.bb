SUMMARY = "The procps library"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.3"

RPM_NAME = "libproc2-0-4.0.3-1.4.aarch64.rpm"
RPM_HASH = "e7c71268831c44f1ea3e58a2fbdc62f2dcefaac084d1fbb3847dfe54432e02a5645f3e3a32719a91fc5695739296a19cb622a0737e1d00fc636e6902fd9b3a11"

RPROVIDES:${PN} += "libproc2-0 \
libproc2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
