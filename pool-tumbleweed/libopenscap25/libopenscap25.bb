SUMMARY = "OpenSCAP C Library"
DESCRIPTION = "The OpenSCAP C Library for easy integration with SCAP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.7"

RPM_NAME = "libopenscap25-1.3.7-1.1.aarch64.rpm"
RPM_HASH = "ec0685cc90da67091f4758de79a81ddbe51a051d16842d258e99edacbc65afcf16dcb0b3aebb00bb4efcf40d0ad2e1f6f2d8f3977414f14219866acb83d50033"

RPROVIDES:${PN} += "libopenscap.so.25()(64bit) \
libopenscap25 \
libopenscap25(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libacl.so.1()(64bit) \
libblkid.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcap.so.2()(64bit) \
libcurl.so.4()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libexslt.so.0()(64bit) \
libgcrypt.so.20()(64bit) \
libpcre.so.1()(64bit) \
libprocps.so.8()(64bit) \
libprocps.so.8(LIBPROCPS_0)(64bit) \
librpm.so.9()(64bit) \
librpmio.so.9()(64bit) \
libselinux.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxmlsec1-openssl.so.1()(64bit) \
libxmlsec1.so.1()(64bit) \
libxslt.so.1()(64bit)"

inherit rpm
