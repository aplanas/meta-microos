SUMMARY = "Network (Netscape) Security Services development files"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards."
LICENSE = "MPL-2.0"

PV = "3.90"

RPM_NAME = "mozilla-nss-devel-3.90-1.1.aarch64.rpm"
RPM_HASH = "11d98f9d76f061d7338acc537ae0bbc9d30d1fa29e5faa4d7228c7be74de72c4ecf172384f1abbeaa5934d5e7b51e30615da134942a6ea19a01f55b363f919a9"

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
