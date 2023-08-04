SUMMARY = "Freebl library for the Network Security Services"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards. \
 \
This package installs the freebl library from NSS."
LICENSE = "MPL-2.0"

PV = "3.91"

RPM_NAME = "libfreebl3-3.91-1.1.aarch64.rpm"
RPM_HASH = "3a8cd7aafeffa3295e8ffe2fa68c181a1170c798fa23d3a1477dbf5552e2ade22d5b2c26e4ff12e25d1e5af45e9101fd706273faadb9c2af23e7480b021ce19a"

RPROVIDES:${PN} += "libfreebl3 \
libfreebl3-hmac \
libfreebl3.so \
libfreeblpriv3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
