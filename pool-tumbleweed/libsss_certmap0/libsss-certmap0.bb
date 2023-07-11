SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map certs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "libsss_certmap0-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "c775eb2b5e5b325479089d79dc02ad7565e0e6a52d526c6ab8e42d2879138191a41abc3ae1898de184c81099c876ae3d53c6a985f97aa20d1450ff462d455204"

RPROVIDES:${PN} += "libsss-certmap.so.0 \
libsss-certmap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtalloc.so.2"

inherit rpm
