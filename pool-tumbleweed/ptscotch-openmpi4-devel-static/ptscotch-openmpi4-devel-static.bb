SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi4-devel-static-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "cca065051610031cbefb1d2d9c03994c3dd252f701738550fb5e42bf3c63c46fa6b8580a143123cbd8f46d47e11cfc9306491a7812c1738903b0d835b957eef9"

RPROVIDES:${PN} += "ptscotch-openmpi4-devel-static \
scotch-devel-static"

RDEPENDS:${PN} += "ptscotch-openmpi4-devel"

inherit rpm
