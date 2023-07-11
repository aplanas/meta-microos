SUMMARY = "Dependency package for libptscotch_6_1_0-gnu-openmpi4-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package libptscotch-gnu-openmpi4-hpc provides the dependency to get binary package libptscotch_6_1_0-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch-gnu-openmpi4-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "a484c002c239b634e82cbfef5196f4870275c2105c8c83c0755cc1efdd9d18a6ce3224591c7c2ede40c30ec3f483a621ca7e59161534e69ecf87252686b851be"

RPROVIDES:${PN} += "libptscotch-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libptscotch-6-1-0-gnu-openmpi4-hpc"

inherit rpm
