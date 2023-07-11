SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi3-hpc-devel"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi3-hpc-devel provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi3-hpc-devel-6.1.0-2.8.noarch.rpm"
RPM_HASH = "f36a246b8e594fcd439484fb54b5af90b1562c8dbb7d6ad305c9452a1bfa99d67ae39cfd97ace95b9a3ae8eaac0ec43c0138334bbfd2fb93465b9129a15f1eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ptscotch-6-1-0-gnu-openmpi3-hpc-devel"

inherit rpm
