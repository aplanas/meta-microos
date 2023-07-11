SUMMARY = "Generator for nonisomorphic fullerenes"
DESCRIPTION = "Buckygen is a program for the efficient generation of all \
nonisomorphic fullerenes. These are triangulations where all vertices \
have degree 5 or 6. Or if the dual representation is used: cubic \
plane graphs where all faces are pentagons or hexagons."
LICENSE = "GPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "buckygen-1.1-1.12.aarch64.rpm"
RPM_HASH = "96946790fdfe72874a7c21900fdcca3bd1a6804f003a8adecfb0da26064296dddc1f95176070024ced4c3a4c18fec81d66218fb26aecb294c8625f1ad10f10fc"

RPROVIDES:${PN} += "buckygen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
