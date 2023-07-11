SUMMARY = "Utility to read several different streaming archive formats"
DESCRIPTION = "This package contains the bsdtar cmdline utility."
LICENSE = "BSD-2-Clause"

PV = "3.6.2"

RPM_NAME = "bsdtar-3.6.2-1.5.aarch64.rpm"
RPM_HASH = "1b06ddbcaf3025e53589b7683d0a6b6394ad628d82e7edb4aca19fc6645db57dcf139a54f35916ec46f6173ff6461df8d99079bd47efb576c494ae0242decaf2"

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
