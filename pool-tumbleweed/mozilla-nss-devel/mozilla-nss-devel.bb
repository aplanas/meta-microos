SUMMARY = "Network (Netscape) Security Services development files"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards."
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "mozilla-nss-devel-3.89-2.1.aarch64.rpm"
RPM_HASH = "f1ecf107b086d2f9b9e5033c43f802e2359ed8afa47aff4806deec976b4b0281079a99811cda9bb670265af383b0af0a69e840b262f2a15c26d281c59490fa3e"

RPROVIDES:${PN} += "mozilla-nss-devel \
pkgconfig-nss \
pkgconfig-nss-util"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libfreebl3 \
libsoftokn3 \
mozilla-nss \
pkgconfig-nspr \
pkgconfig-nss-util"

inherit rpm
