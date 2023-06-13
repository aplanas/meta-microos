SUMMARY = "Development package for GnuTLS DANE component"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutls-dane-devel-3.8.0-4.1.aarch64.rpm"
RPM_HASH = "46cc6e89fc8a32631622528738eb18dd60accec9114dc21c01aacb02e950b6682ace87d6c722e2271b2dfd91edbc42642bfa5a6a36ce26c478a17dc46f73f512"

RPROVIDES:${PN} += "libgnutls-dane-devel \
libgnutls-dane-devel(aarch-64) \
pkgconfig(gnutls-dane)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnutls-dane0 \
pkgconfig(gnutls)"

inherit rpm
