SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi4-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi4-hpc provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi4-hpc-6.1.0-2.9.noarch.rpm"
RPM_HASH = "3223cfb9841dcc9ed3020a41f985c0c0feec4b7730ccc98ee98d2cd63b42d3234a7fde164590bb8ccbe72747bc4c4385ef29e05efcf9345fe732ff73b888696c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ptscotch-6-1-0-gnu-openmpi4-hpc"

inherit rpm
