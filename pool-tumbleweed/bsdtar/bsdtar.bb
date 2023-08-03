SUMMARY = "Utility to read several different streaming archive formats"
DESCRIPTION = "This package contains the bsdtar cmdline utility."
LICENSE = "BSD-2-Clause"

PV = "3.7.0"

RPM_NAME = "bsdtar-3.7.0-1.1.aarch64.rpm"
RPM_HASH = "d9a9bddfeee96b1b1ce0e5893364d560161768afc6ee65c635a23da910955bf3af18b930372dc7d1a3785a4a5e7fc8df4b4adbd0a7f943b4d7e04842873961b8"

RPROVIDES:${PN} += "bsdtar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libarchive13 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblz4.so.1 \
liblzma.so.5 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
