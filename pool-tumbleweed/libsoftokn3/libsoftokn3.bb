SUMMARY = "Network Security Services Softoken Module"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards. \
 \
Network Security Services Softoken Cryptographic Module"
LICENSE = "MPL-2.0"

PV = "3.90"

RPM_NAME = "libsoftokn3-3.90-2.1.aarch64.rpm"
RPM_HASH = "3140a90344bceaf1101cc0ac3a564e713a137b1abe41904bf9912c76d77a7233bbc5a855ed9cc9cb5f45eb8e8952b71dc9bf604c46944133b5e64825b8a6f2a5"

RPROVIDES:${PN} += "libnssdbm3.so \
libsoftokn3 \
libsoftokn3-hmac \
libsoftokn3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreebl3 \
libnspr4.so \
libnssutil3.so \
libplc4.so \
libplds4.so \
libsqlite3.so.0"

inherit rpm
