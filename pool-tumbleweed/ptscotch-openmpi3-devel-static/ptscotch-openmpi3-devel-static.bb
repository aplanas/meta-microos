SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi3-devel-static-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "9b9162b9ccc72a9ee98fb63f56fd861f4f64f451af19c2bae7657bfa83ea34f9735fa4eadb5bea370e20ae2efa097d8d36a2b208076e333c324b5c62268e0e9e"

RPROVIDES:${PN} += "ptscotch-openmpi3-devel-static \
scotch-devel-static"

RDEPENDS:${PN} += "ptscotch-openmpi3-devel"

inherit rpm
