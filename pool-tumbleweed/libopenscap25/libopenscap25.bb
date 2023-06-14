SUMMARY = "OpenSCAP C Library"
DESCRIPTION = "The OpenSCAP C Library for easy integration with SCAP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.7"

RPM_NAME = "libopenscap25-1.3.7-1.1.aarch64.rpm"
RPM_HASH = "ec0685cc90da67091f4758de79a81ddbe51a051d16842d258e99edacbc65afcf16dcb0b3aebb00bb4efcf40d0ad2e1f6f2d8f3977414f14219866acb83d50033"

RPROVIDES:${PN} += "libopenscap.so.25 \
libopenscap25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libblkid.so.1 \
libbz2.so.1 \
libc.so.6 \
libcap.so.2 \
libcurl.so.4 \
libdbus-1.so.3 \
libexslt.so.0 \
libgcrypt.so.20 \
libpcre.so.1 \
libprocps.so.8 \
librpm.so.9 \
librpmio.so.9 \
libselinux.so.1 \
libxml2.so.2 \
libxmlsec1-openssl.so.1 \
libxmlsec1.so.1 \
libxslt.so.1"

inherit rpm
