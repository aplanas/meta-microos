SUMMARY = "Development files for tntdb"
DESCRIPTION = "Headers and so links for tntdb library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libtntdb-devel-1.4-1.13.aarch64.rpm"
RPM_HASH = "e4a558b29114e6a428830873b712f50e009bf7bd6dcd20bac641d338bba1894520f3a7f6912eb8aa985a0025cd79fd2bbd7753111ff2fd121216bb907c9f1cd9"

RPROVIDES:${PN} += "libtntdb-devel \
pkgconfig-tntdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtntdb5 \
pkgconfig-cxxtools"

inherit rpm
