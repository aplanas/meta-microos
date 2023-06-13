SUMMARY = "Dependency package for libptscotch_6_1_0-gnu-openmpi3-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package libptscotch-gnu-openmpi3-hpc provides the dependency to get binary package libptscotch_6_1_0-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch-gnu-openmpi3-hpc-6.1.0-2.7.aarch64.rpm"
RPM_HASH = "78d8485b5f9baedce0d03f56ef4cec09d5de3dc797654494f9439e99f3c3ff8c72c6ba28460d5e804d16259e9344f32c764c518a11fb4ee8451906ea5ecbda76"

RPROVIDES:${PN} += "libptscotch-gnu-openmpi3-hpc \
libptscotch-gnu-openmpi3-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libptscotch_6_1_0-gnu-openmpi3-hpc"

inherit rpm
