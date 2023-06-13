SUMMARY = "Utility to read several different streaming archive formats"
DESCRIPTION = "This package contains the bsdtar cmdline utility."
LICENSE = "BSD-2-Clause"

PV = "3.6.2"

RPM_NAME = "bsdtar-3.6.2-1.4.aarch64.rpm"
RPM_HASH = "5cea77d49b9e40d662b013d6a30038c9d3f74021c0261772add5fd57090b11d4367319b4c3a405a8515d2d97dbb8807495284d46f02cf3c7e57f2e118b7625ab"

RPROVIDES:${PN} += "bsdtar \
bsdtar(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libarchive13 \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
liblz4.so.1()(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.5)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
