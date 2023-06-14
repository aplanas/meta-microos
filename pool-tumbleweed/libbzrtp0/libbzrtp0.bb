SUMMARY = "ZRTP key exchange protocol implementation"
DESCRIPTION = "bzrtp is an implementation of the ZRTP key exchange protocol. \
The library written in C89."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "libbzrtp0-5.2.49-1.1.aarch64.rpm"
RPM_HASH = "ab5d761a1bdd2d6be04dfc33281873135e44e03e00efa27ad5b04b9eadd357832381cb97d25cfdcbc9eb35b54456dc3152822ce6635b4d8491a96ecc4a92f0c9"

RPROVIDES:${PN} += "libbzrtp.so.0 \
libbzrtp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libc.so.6 \
libsqlite3.so.0 \
libxml2.so.2"

inherit rpm
