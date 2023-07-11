SUMMARY = "Dependency package for libscotch_6_1_0-gnu-hpc"
DESCRIPTION = "scotch: Graph, mesh and hypergraph partitioning library \
The package libscotch-gnu-hpc provides the dependency to get binary package libscotch_6_1_0-gnu-hpc. \
When this package gets updated it installs the latest version of scotch_6_1_0-gnu-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libscotch-gnu-hpc-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "1743d7cb18698fa244856c36b51ed87589b9c1273c66011e81be0cab58109aeb4b46f95d5e6fbfd1274ac49113f4a899cfee07e5b1dd5092cefbfd1f092e79af"

RPROVIDES:${PN} += "libscotch-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libscotch-6-1-0-gnu-hpc"

inherit rpm
