SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi4-hpc-devel"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi4-hpc-devel provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi4-hpc-devel-6.1.0-2.9.noarch.rpm"
RPM_HASH = "7a999b966a4fcfd282c84ad15ba45c9046deae89f0d264f827bdb3a18988ba8fee59ae62da66a0bc4d9e72b0556efa6369a262bcef39adeeca5de05af96db526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ptscotch-6-1-0-gnu-openmpi4-hpc-devel"

inherit rpm
