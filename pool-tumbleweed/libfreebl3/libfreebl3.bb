SUMMARY = "Freebl library for the Network Security Services"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards. \
 \
This package installs the freebl library from NSS."
LICENSE = "MPL-2.0"

PV = "3.93"

RPM_NAME = "libfreebl3-3.93-1.1.aarch64.rpm"
RPM_HASH = "58b85e0dc758952f9d45fdb0e2d1c3b01ea4f59b4a5a5871d525995a6d768f0b4e7b2771b98aacfcf69d6d8a378dff9435a3b4a507c7bf41308cfcd8b5cdc44f"

RPROVIDES:${PN} += "libfreebl3 \
libfreebl3-hmac \
libfreebl3.so \
libfreeblpriv3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
