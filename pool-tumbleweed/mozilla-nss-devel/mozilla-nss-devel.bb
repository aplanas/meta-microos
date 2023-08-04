SUMMARY = "Network (Netscape) Security Services development files"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards."
LICENSE = "MPL-2.0"

PV = "3.91"

RPM_NAME = "mozilla-nss-devel-3.91-1.1.aarch64.rpm"
RPM_HASH = "4ad824b913d9ef429c30469e196d02be147ea52698c76df24a19bab0f3bce3c684d7ec87088cd7f64a453855b31c30c543f7fae37c50452347404c769f28ccc2"

RPROVIDES:${PN} += "mozilla-nss-devel \
pkgconfig-nss \
pkgconfig-nss-util"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libfreebl3 \
libsoftokn3 \
mozilla-nss \
pkgconfig-nspr \
pkgconfig-nss-util"

inherit rpm
