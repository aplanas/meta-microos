SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-mpich-hpc-devel"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-mpich-hpc-devel provides the dependency to get binary package ptscotch_6_1_0-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-mpich-hpc-devel-6.1.0-2.10.noarch.rpm"
RPM_HASH = "f014704dc202d5a65aef0cf5ff09cba8ffb018d48fada5131461009d971ab7be4a4f711e53b4c996d5d587afbc12250fb17de0a09c662a7193a7a8aed93ebc1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ptscotch-6-1-0-gnu-mpich-hpc-devel"

inherit rpm
