SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi2-devel-static-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "d899e48889025a00d648210311c92d1d85389f4f0301e71aec0bd5e2c5a7a7ddf0f1d41e71a0b61ce6814d3ff5f0b89a93b15a4073777997534c6850a4bb5716"

RPROVIDES:${PN} += "ptscotch-openmpi2-devel-static \
scotch-devel-static"

RDEPENDS:${PN} += "ptscotch-openmpi2-devel"

inherit rpm
