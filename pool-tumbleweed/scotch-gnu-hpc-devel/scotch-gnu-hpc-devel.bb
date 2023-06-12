SUMMARY = "Dependency package for scotch_6_1_0-gnu-hpc-devel"
DESCRIPTION = "scotch: Graph, mesh and hypergraph partitioning library \
The package scotch-gnu-hpc-devel provides the dependency to get binary package scotch_6_1_0-gnu-hpc-devel. \
When this package gets updated it installs the latest version of scotch_6_1_0-gnu-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch-gnu-hpc-devel-6.1.0-2.9.noarch.rpm"
RPM_HASH = "538a7b8626c5ccf9a0dd91fdb8a7a37e53753b339fcaec891522bd576cb7aefcc820d5f0c101cca6003a2310094c595c762d8db190e7012fb1f4779cf3837bc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scotch-gnu-hpc-devel"
RDEPENDS:${PN} += "/bin/sh \
scotch_6_1_0-gnu-hpc-devel"

inherit rpm
