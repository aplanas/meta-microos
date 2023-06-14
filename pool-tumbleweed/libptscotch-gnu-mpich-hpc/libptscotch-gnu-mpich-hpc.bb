SUMMARY = "Dependency package for libptscotch_6_1_0-gnu-mpich-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package libptscotch-gnu-mpich-hpc provides the dependency to get binary package libptscotch_6_1_0-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch-gnu-mpich-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "9d1c5ce178cd51b8c9ae97e61bc44f70dc539e56f706349abe7f9f74bc5065ccd3ed7d01b6f0f0775121777f9f9782457c9fc942ba3dd05e850a06c977b47534"

RPROVIDES:${PN} += "libptscotch-gnu-mpich-hpc"

RDEPENDS:${PN} += "/bin/sh \
libptscotch-6-1-0-gnu-mpich-hpc"

inherit rpm
