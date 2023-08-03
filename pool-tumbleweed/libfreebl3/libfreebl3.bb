SUMMARY = "Freebl library for the Network Security Services"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards. \
 \
This package installs the freebl library from NSS."
LICENSE = "MPL-2.0"

PV = "3.90"

RPM_NAME = "libfreebl3-3.90-2.1.aarch64.rpm"
RPM_HASH = "00b57a999f77dfe49787ff86cd92a69ffe82b7a1da03ce1226b1a5f0c9ed39b54c22b2a3026aeb3af5afa65b76b7bd870e231e8b87f06bbfaedea4fb36f177c1"

RPROVIDES:${PN} += "libfreebl3 \
libfreebl3-hmac \
libfreebl3.so \
libfreeblpriv3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
