SUMMARY = "Dependency package for scotch_6_1_0-gnu-hpc-devel"
DESCRIPTION = "scotch: Graph, mesh and hypergraph partitioning library \
The package scotch-gnu-hpc-devel provides the dependency to get binary package scotch_6_1_0-gnu-hpc-devel. \
When this package gets updated it installs the latest version of scotch_6_1_0-gnu-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch-gnu-hpc-devel-6.1.0-2.10.noarch.rpm"
RPM_HASH = "07cf8ff19bec84052f95573c7116002df514c54e8a378a07ee2b33417fcbab668685b722f893b2db92542f1e98ff90183a3fb693acef8400f506e809efdf08ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scotch-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
scotch-6-1-0-gnu-hpc-devel"

inherit rpm
