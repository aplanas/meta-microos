SUMMARY = "Dependency package for libptscotch_6_1_0-gnu-mvapich2-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package libptscotch-gnu-mvapich2-hpc provides the dependency to get binary package libptscotch_6_1_0-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch-gnu-mvapich2-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "e581b8367fad8393e5c166428ad86b2dfc2926c571ef5c281d7aaff8bb35e63281d995915cdcdf35e05725fee6ad6e195db0c4002c2feeb607e01709bd547b45"

RPROVIDES:${PN} += "libptscotch-gnu-mvapich2-hpc \
libptscotch-gnu-mvapich2-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libptscotch_6_1_0-gnu-mvapich2-hpc"

inherit rpm
