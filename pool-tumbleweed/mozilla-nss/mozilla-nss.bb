SUMMARY = "Network Security Services"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards."
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "mozilla-nss-3.89-2.1.aarch64.rpm"
RPM_HASH = "b8ea44f40c9618755461c17442b492b5d184de4141a9b15dab6b6bc0f9867a1c75398e2881947476fdb6ae2e0fb3eb3261ef00310b8c2d8e6d3c3d01f48889a1"

RPROVIDES:${PN} += "libnss3.so \
libnssutil3.so \
libsmime3.so \
libssl3.so \
mozilla-nss"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreebl3 \
libnspr4.so \
libnssckbi.so \
libplc4.so \
libplds4.so \
libsoftokn3 \
mozilla-nspr"

inherit rpm
