SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi4-hpc-devel"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi4-hpc-devel provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi4-hpc-devel-6.1.0-2.8.noarch.rpm"
RPM_HASH = "18e347433ccc13a2a596a84e94ef868ad20314115799287301d8bdc28d12a97e0eebb0bc1a032a601305ceaae96b192e9944e7de2c483542373c2ff060089c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
ptscotch_6_1_0-gnu-openmpi4-hpc-devel"

inherit rpm
