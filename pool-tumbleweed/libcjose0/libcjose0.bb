SUMMARY = "C library implementing the Javascript Object Signing and Encryption (JOSE)"
DESCRIPTION = "C library implementing the Javascript Object Signing and Encryption (JOSE)"
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "libcjose0-0.6.1-4.2.aarch64.rpm"
RPM_HASH = "aa19ea65c637d920df651a4925d1baf4e0083f5c1a823588066016b210b380b382210bd346b8c6f758b2bf8817377eef7bc5878551a7cf9132fa9b60e287c6ac"

RPROVIDES:${PN} += "libcjose.so.0 \
libcjose0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjansson.so.4"

inherit rpm
