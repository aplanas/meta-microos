SUMMARY = "Development files for the knot libraries"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains headers for knot."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "knot-devel-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "42d1e0e453832222a28f90c4904e12835c09377f6c09b402487810025daef78320298e0c2e1cb0637a0fd0495f67ae02992355e09a8c61884cd9c72869e0f205"

RPROVIDES:${PN} += "knot-devel \
knot-devel(aarch-64) \
pkgconfig(knotd) \
pkgconfig(libdnssec) \
pkgconfig(libknot) \
pkgconfig(libzscanner)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
knot \
libdnssec9 \
libknot13 \
libzscanner4 \
pkgconfig(gnutls)"

inherit rpm
