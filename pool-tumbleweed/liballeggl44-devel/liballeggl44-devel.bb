SUMMARY = "Development files for AllegroGL"
DESCRIPTION = "This package is needed to build programs that use AllegroGL."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liballeggl44-devel-4.4.3.1-1.16.aarch64.rpm"
RPM_HASH = "8126cabbb962f8bd9ba3b0187a1da6e521a0d15bb6202306942d1991455b46c55214554aef282b81b0e2df04f4727724d88756f7877369746c97c24019e116e2"

RPROVIDES:${PN} += "liballeggl44-devel \
pkgconfig-allegrogl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballeggl4-4 \
pkgconfig-allegro"

inherit rpm
