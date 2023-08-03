SUMMARY = "Network (Netscape) Security Services development files"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards."
LICENSE = "MPL-2.0"

PV = "3.90"

RPM_NAME = "mozilla-nss-devel-3.90-2.1.aarch64.rpm"
RPM_HASH = "9ffeadcaa00a11ba1d62159fde33e7a4558a0baef17940d7b01e4e7c2dd59830422988c6514375754b0126f4e9af2bb9b6e9431f1bda04fd27143cde343e6b57"

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
