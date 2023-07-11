SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-mpich-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-mpich-hpc provides the dependency to get binary package ptscotch_6_1_0-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-mpich-hpc-6.1.0-2.10.noarch.rpm"
RPM_HASH = "d8d8c2b4d908b17f3007a270f8d188abf50d6a6cace751349f3d4a1517316d1ebf02cfc1e757631de3384ec80666f88bccb8f8b08b585c7382d60bc4e88e74ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ptscotch-6-1-0-gnu-mpich-hpc"

inherit rpm
