SUMMARY = "Dependency package for libptscotch_6_1_0-gnu-openmpi2-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package libptscotch-gnu-openmpi2-hpc provides the dependency to get binary package libptscotch_6_1_0-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch-gnu-openmpi2-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "c3c235c6e22e6d35057f50555aec0cc8f2bdd012269b57a308c3179217d9143baed9ec725aabc55cd88f30e4f77b0aa32151f1e9d5cf788189a419ed961596d3"

RPROVIDES:${PN} += "libptscotch-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libptscotch-6-1-0-gnu-openmpi2-hpc"

inherit rpm
