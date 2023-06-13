SUMMARY = "Shared library for hiredis"
DESCRIPTION = "Shared library for hiredis. The hiredis-example and \
hiredis-test are in hiredis package."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "libhiredis1_1_0-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "de20e9106a0f6e54b7a6990feefafa838418f134b67d8b750c3a8eb0c090655f314497356355562ad9a3f739c48318c77256a556d37f44e6472464f9c9515a94"

RPROVIDES:${PN} += "libhiredis.so.1.1.0()(64bit) \
libhiredis1_1_0 \
libhiredis1_1_0(aarch-64) \
libhiredis_ssl.so.1.1.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
