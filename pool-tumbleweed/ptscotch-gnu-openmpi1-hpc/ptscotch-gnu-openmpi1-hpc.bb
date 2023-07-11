SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi1-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi1-hpc provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi1-hpc-6.1.0-2.9.noarch.rpm"
RPM_HASH = "ac2eb79bf25b536a6ab5c9ec6b5763170dba85748bd2f07f42883189798d75b9a0b0bd52a4d29d78c8305a7975d1b4846f188afd3ab0e6ced4a51dc840ac0f65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ptscotch-6-1-0-gnu-openmpi1-hpc"

inherit rpm
