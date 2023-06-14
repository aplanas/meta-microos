SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi3-hpc-devel"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi3-hpc-devel provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi3-hpc-devel-6.1.0-2.7.noarch.rpm"
RPM_HASH = "874afee698b1777e2f5917085bfd21e97bd2c44649158c67cc39bad1e7dbf8fb131a1d8cb54b170ff8cc249ddbcfa58f508a04fdf06272b89ef6fb4b3e1c3a5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
ptscotch-6-1-0-gnu-openmpi3-hpc-devel"

inherit rpm
