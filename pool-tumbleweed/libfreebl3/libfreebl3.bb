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

RPM_NAME = "libfreebl3-3.90-1.1.aarch64.rpm"
RPM_HASH = "dec2c9ed7a8071f881f4fbea45e6a7a10b6ed643fb2e811fd2d2e00900ccf33caf980289ff0629ea2475b176277fc35ede1387b8b4c8160ebe1b3b1a11a885ed"

RPROVIDES:${PN} += "libfreebl3 \
libfreebl3-hmac \
libfreebl3.so \
libfreeblpriv3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
