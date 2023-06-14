SUMMARY = "Z39.50 protocol library"
DESCRIPTION = "YAZ is a C library for developing client and server applications \
using the ANSI/NISO Z39.50 protocol for Information Retrieval."
LICENSE = "BSD-3-Clause"

PV = "5.34.0"

RPM_NAME = "libyaz5-5.34.0-1.4.aarch64.rpm"
RPM_HASH = "788f5c9b22c211f7ded559ce3deefb37599c24a1a50a52e3465b0bdbfe587eb29d4869d0f4d6b73f5905ee41bc40181e51a94316c94c8739c986e79957daba8a"

RPROVIDES:${PN} += "libyaz \
libyaz-icu.so.5 \
libyaz-server.so.5 \
libyaz.so.5 \
libyaz5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libgnutls.so.30 \
libicui18n.so.73 \
libicuuc.so.73 \
libwrap.so.0 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
