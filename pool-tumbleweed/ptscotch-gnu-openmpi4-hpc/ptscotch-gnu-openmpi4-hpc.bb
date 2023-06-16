SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi4-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi4-hpc provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi4-hpc-6.1.0-2.8.noarch.rpm"
RPM_HASH = "c815ffe6d4bf614be1a71f4517c7ac89aa921ca1c7edd3ca5f11e2c22a3081f863670bef96281ba84bbb0af7e02503baccc505ae1a9cacc6a24f60bfd438f7b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ptscotch-6-1-0-gnu-openmpi4-hpc"

inherit rpm
