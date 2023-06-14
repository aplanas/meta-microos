SUMMARY = "Utility to read several different streaming archive formats"
DESCRIPTION = "This package contains the bsdtar cmdline utility."
LICENSE = "BSD-2-Clause"

PV = "3.6.2"

RPM_NAME = "bsdtar-3.6.2-1.4.aarch64.rpm"
RPM_HASH = "5cea77d49b9e40d662b013d6a30038c9d3f74021c0261772add5fd57090b11d4367319b4c3a405a8515d2d97dbb8807495284d46f02cf3c7e57f2e118b7625ab"

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
