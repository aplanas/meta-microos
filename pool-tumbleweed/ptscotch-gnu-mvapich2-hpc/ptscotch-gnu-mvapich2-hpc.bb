SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-mvapich2-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-mvapich2-hpc provides the dependency to get binary package ptscotch_6_1_0-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-mvapich2-hpc-6.1.0-2.10.noarch.rpm"
RPM_HASH = "ec7522f0c1ca0d776554f91df3e918a3288ee36f203131048ea4a684b1176fec31de263f880d0bceca351afd502e089e040336a8b51f6d32e0fecaac427b2b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ptscotch-6-1-0-gnu-mvapich2-hpc"

inherit rpm
