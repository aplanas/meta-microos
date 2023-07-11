SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi2-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi2-hpc provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi2-hpc-6.1.0-2.9.noarch.rpm"
RPM_HASH = "f58b08fac2ede10f58f5f779dd9b9fd236ca15213859b73924457be3208b7def1dbe54920859cecfea18a3fe51693af92586bf0b483d87cf0eb16b250dda621c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ptscotch-6-1-0-gnu-openmpi2-hpc"

inherit rpm
