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

RPM_NAME = "libsoftokn3-3.90-1.1.aarch64.rpm"
RPM_HASH = "c263c6f460f690017dbf8683d8cb8dd796cba0ad80406bea9a97d0c2137a7fd9d7b8bcb4e342db445061914cafe9b6c428aa3680ee19b1575410f9b52dbd8c2b"

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
