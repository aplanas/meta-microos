SUMMARY = "Network Security Services"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards."
LICENSE = "MPL-2.0"

PV = "3.90"

RPM_NAME = "mozilla-nss-3.90-1.1.aarch64.rpm"
RPM_HASH = "89118895bd0d5398ae321510dc900e5644538d3fd8d886e924ea699260855e9a3be590cd55e81ddff7eab00c7d0021d12cb7e97eca45ed5d392d4f50459b9bbf"

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
