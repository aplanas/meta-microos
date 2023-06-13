SUMMARY = "Z39.50 protocol library"
DESCRIPTION = "YAZ is a C library for developing client and server applications \
using the ANSI/NISO Z39.50 protocol for Information Retrieval."
LICENSE = "BSD-3-Clause"

PV = "5.34.0"

RPM_NAME = "libyaz5-5.34.0-1.4.aarch64.rpm"
RPM_HASH = "788f5c9b22c211f7ded559ce3deefb37599c24a1a50a52e3465b0bdbfe587eb29d4869d0f4d6b73f5905ee41bc40181e51a94316c94c8739c986e79957daba8a"

RPROVIDES:${PN} += "libyaz \
libyaz.so.5()(64bit) \
libyaz5 \
libyaz5(aarch-64) \
libyaz_icu.so.5()(64bit) \
libyaz_server.so.5()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libexslt.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libwrap.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit)"

inherit rpm
