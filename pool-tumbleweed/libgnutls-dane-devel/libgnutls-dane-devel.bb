SUMMARY = "Development package for GnuTLS DANE component"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.1"

RPM_NAME = "libgnutls-dane-devel-3.8.1-1.1.aarch64.rpm"
RPM_HASH = "7da5f6554630701aad4b856d290b07e59d4b77e77d7a98eb6635356886bff4676efe448cca29e28628da0493745de164bbda39d7a0db877b15a68de6d2136bd9"

RPROVIDES:${PN} += "libgnutls-dane-devel \
pkgconfig-gnutls-dane"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnutls-dane0 \
pkgconfig-gnutls"

inherit rpm
