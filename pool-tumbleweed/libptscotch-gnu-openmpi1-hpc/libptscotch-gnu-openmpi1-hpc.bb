SUMMARY = "Dependency package for libptscotch_6_1_0-gnu-openmpi1-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package libptscotch-gnu-openmpi1-hpc provides the dependency to get binary package libptscotch_6_1_0-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch-gnu-openmpi1-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "f7fb5900fcf55d6b22165900bb559b4f50292452e343307a6c84ab34060c96d77e58394247e9d84699903ae09750d1f30643bc9e563c91d51ba2dd99020f5ac2"

RPROVIDES:${PN} += "libptscotch-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libptscotch-6-1-0-gnu-openmpi1-hpc"

inherit rpm
