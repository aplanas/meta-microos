SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi3-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi3-hpc provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi3-hpc-6.1.0-2.8.noarch.rpm"
RPM_HASH = "6d17b22423b0f8e363e406aaade923f9ec769e14d286d6be98d270aa53665fe8f5fcac523651335065fcc645542e110a0fd4a4a445b80d14136dfd31c6e08a21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ptscotch-6-1-0-gnu-openmpi3-hpc"

inherit rpm
