SUMMARY = "Network (Netscape) Security Services development files"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards."
LICENSE = "MPL-2.0"

PV = "3.93"

RPM_NAME = "mozilla-nss-devel-3.93-1.1.aarch64.rpm"
RPM_HASH = "2db940509a3bd93aee62dc5f551f276d214fe3e5a5b13425e37739f9003fbf4c4982fa0c1c1f960d162d2f85342d8948c12fb66d7d882f48962ba6093d2f498d"

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
