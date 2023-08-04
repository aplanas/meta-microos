SUMMARY = "Network Security Services Softoken Module"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards. \
 \
Network Security Services Softoken Cryptographic Module"
LICENSE = "MPL-2.0"

PV = "3.91"

RPM_NAME = "libsoftokn3-3.91-1.1.aarch64.rpm"
RPM_HASH = "44e1dea0b0adc6b616905ebb2ba1473e3fd61c9e840aa01d0c9ad07d1ffb9986752e34c3be1845f226197d2dd0e4cbe326c6dbdea3323c1b54310f6702a73c40"

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
