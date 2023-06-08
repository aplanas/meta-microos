SUMMARY = "Headers required when building programs against cfitsio library"
DESCRIPTION = "This package contains headers required when building programs against cfitsio \
library."
LICENSE = "ISC"

PV = "4.2.0"

RPM_NAME = "cfitsio-devel-4.2.0-2.3.aarch64.rpm"
RPM_HASH = "ee65b0a6603a39f787a401028410526b56949638345f33034f25847343dcb9f95d16792025164478930748780573b2cfcbc00e350ee5782aa63030f4c4ba5106"

RPROVIDES:${PN} += "cfitsio-devel cfitsio-devel(aarch-64) pkgconfig(cfitsio)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcfitsio10"

inherit rpm
