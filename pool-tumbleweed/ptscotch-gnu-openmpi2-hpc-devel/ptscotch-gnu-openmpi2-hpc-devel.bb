SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi2-hpc-devel"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi2-hpc-devel provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi2-hpc-devel-6.1.0-2.9.noarch.rpm"
RPM_HASH = "4a794d31a7534abe369de703dfc58a58176dd702f3e6771e69b1b0c34392fc5355047d5960119eda71ba451f11a8472933a5fc9a007f15ac25c714d0158ae063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ptscotch-6-1-0-gnu-openmpi2-hpc-devel"

inherit rpm
