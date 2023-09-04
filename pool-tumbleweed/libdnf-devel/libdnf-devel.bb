SUMMARY = "Development files for libdnf"
DESCRIPTION = "This package provides the headers and libraries for developing applications \
that use libdnf."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.2"

RPM_NAME = "libdnf-devel-0.70.2-1.1.aarch64.rpm"
RPM_HASH = "d90bb013d2d8fd076da4427174f99627ebe7053d3174bd25c7dbd53d4833072a427c8242034576c56234e6408953e312538b138e943c7fa9b2e4f4755e72e995"

RPROVIDES:${PN} += "libdnf-devel \
pkgconfig-libdnf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdnf2 \
pkgconfig-glib-2.0 \
pkgconfig-librepo \
pkgconfig-libsolv \
pkgconfig-libsolvext \
pkgconfig-rpm \
pkgconfig-sqlite3"

inherit rpm
