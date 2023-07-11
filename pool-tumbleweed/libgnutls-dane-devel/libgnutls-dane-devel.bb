SUMMARY = "Development package for GnuTLS DANE component"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutls-dane-devel-3.8.0-4.2.aarch64.rpm"
RPM_HASH = "bae948120f60ad6eca15fe79bfbaab05e3886ed73b4ad9fc4a10674048d1337d1573dd0d4ee84bdd184db0f4e7d8c1685d9215e3979c5ea958a078974074e5c4"

RPROVIDES:${PN} += "libgnutls-dane-devel \
pkgconfig-gnutls-dane"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnutls-dane0 \
pkgconfig-gnutls"

inherit rpm
