SUMMARY = "Dependency package for scotch_6_1_0-gnu-hpc"
DESCRIPTION = "scotch: Graph, mesh and hypergraph partitioning library \
The package scotch-gnu-hpc provides the dependency to get binary package scotch_6_1_0-gnu-hpc. \
When this package gets updated it installs the latest version of scotch_6_1_0-gnu-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch-gnu-hpc-6.1.0-2.10.noarch.rpm"
RPM_HASH = "5bc5631daad651d001af6d5e55f6cc0675be2f28ff0883c62d06a1fc33c0fd2ae65a4a9c1a6a33c63956b4a3c87d35611ebff7dd06f3a73dbd289ff90010a6f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scotch-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
scotch-6-1-0-gnu-hpc"

inherit rpm
