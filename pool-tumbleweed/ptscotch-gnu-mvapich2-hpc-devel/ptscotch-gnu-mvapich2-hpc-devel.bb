SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-mvapich2-hpc-devel"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-mvapich2-hpc-devel provides the dependency to get binary package ptscotch_6_1_0-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-mvapich2-hpc-devel-6.1.0-2.9.noarch.rpm"
RPM_HASH = "a1ca5c0984d687aa991c8bff3e4644988c6c82e6a34fc2e50562fbcf8c3c41619f0263bd39d4d1d5b8db60523d2b55c25ca445fc56ef255a0d096e22e7b02481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
ptscotch_6_1_0-gnu-mvapich2-hpc-devel"

inherit rpm
