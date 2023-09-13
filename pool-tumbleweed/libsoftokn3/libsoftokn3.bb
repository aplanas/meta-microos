SUMMARY = "Network Security Services Softoken Module"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards. \
 \
Network Security Services Softoken Cryptographic Module"
LICENSE = "MPL-2.0"

PV = "3.93"

RPM_NAME = "libsoftokn3-3.93-1.1.aarch64.rpm"
RPM_HASH = "f12ca73700e6c38f94673d7a786fb3675ec7f58028248f087d2df79a7c19d533fdbf9ac9e63275fd6d6ec3d568496e2ef75022701394fd8c58b16fa162f1888f"

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
