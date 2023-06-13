SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-mpich-hpc-devel"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-mpich-hpc-devel provides the dependency to get binary package ptscotch_6_1_0-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-mpich-hpc-devel-6.1.0-2.9.noarch.rpm"
RPM_HASH = "03444f8552927b5386e3ce66ec4861ba2054aae276b9e57660cba3572606702fe1da54e0bab45df1fb52591f95262b7ae95c7a1b3de0fe0464f773ad365cc60a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
ptscotch_6_1_0-gnu-mpich-hpc-devel"

inherit rpm
