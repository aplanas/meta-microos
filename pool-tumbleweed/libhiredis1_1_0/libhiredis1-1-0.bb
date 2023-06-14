SUMMARY = "Shared library for hiredis"
DESCRIPTION = "Shared library for hiredis. The hiredis-example and \
hiredis-test are in hiredis package."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "libhiredis1_1_0-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "de20e9106a0f6e54b7a6990feefafa838418f134b67d8b750c3a8eb0c090655f314497356355562ad9a3f739c48318c77256a556d37f44e6472464f9c9515a94"

RPROVIDES:${PN} += "libhiredis-ssl.so.1.1.0 \
libhiredis.so.1.1.0 \
libhiredis1-1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
