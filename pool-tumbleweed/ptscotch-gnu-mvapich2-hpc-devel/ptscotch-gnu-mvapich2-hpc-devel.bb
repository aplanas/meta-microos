SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-mvapich2-hpc-devel"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-mvapich2-hpc-devel provides the dependency to get binary package ptscotch_6_1_0-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-mvapich2-hpc-devel-6.1.0-2.10.noarch.rpm"
RPM_HASH = "f9e458af1351c4b47bc745fe604613049362063e132e584077b3a28e3538897a399e07428212c869921eed49a1e23d48e31a801c5e158dfbe17771dc3c0e1d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ptscotch-6-1-0-gnu-mvapich2-hpc-devel"

inherit rpm
