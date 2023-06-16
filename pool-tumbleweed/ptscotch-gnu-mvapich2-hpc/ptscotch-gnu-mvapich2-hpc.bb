SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-mvapich2-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-mvapich2-hpc provides the dependency to get binary package ptscotch_6_1_0-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-mvapich2-hpc-6.1.0-2.9.noarch.rpm"
RPM_HASH = "8d8ff7483d6f1c2878c2f0a0fb08d42f8004f6b6ce2986c4d65193598a8378dd4b63dcd2521e390dc83de955bfc3363842c1f937eb2d99d59854f861860a27f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ptscotch-6-1-0-gnu-mvapich2-hpc"

inherit rpm
