SUMMARY = "Minimalistic C client for Redis"
DESCRIPTION = "Hiredis is a minimalistic C client library for the \
Redis database."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "hiredis-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "8b4914edf1d903fe7babe55d82a6aa0ceff712e4ae65bd0309b6965b217b5712c28211d8c7bed57cb552cadb0cbf06fc4f83f6fdced94d801564c06bccdd490b"

RPROVIDES:${PN} += "hiredis \
hiredis(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
