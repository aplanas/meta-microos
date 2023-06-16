SUMMARY = "Dependency package for libptscotch_6_1_0-gnu-openmpi2-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package libptscotch-gnu-openmpi2-hpc provides the dependency to get binary package libptscotch_6_1_0-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch-gnu-openmpi2-hpc-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "37859fdf6c0ab5f497813331dc9e41c301c5e85f670cc9ea53f7084a66f72ec83ede93ed0e221a0ef095b74eb151bb72dfc9de9e3d913a7b9c831950ebcf9da7"

RPROVIDES:${PN} += "libptscotch-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libptscotch-6-1-0-gnu-openmpi2-hpc"

inherit rpm
