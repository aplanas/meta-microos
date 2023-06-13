SUMMARY = "Dependency package for metis_5_1_0-gnu-hpc-doc"
DESCRIPTION = "metis: Serial Graph Partitioning and Fill-reducing Matrix Ordering \
The package metis-gnu-hpc-doc provides the dependency to get binary package metis_5_1_0-gnu-hpc-doc. \
When this package gets updated it installs the latest version of metis_5_1_0-gnu-hpc."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-gnu-hpc-doc-5.1.0-9.11.noarch.rpm"
RPM_HASH = "3d2702138135bab93f515a6b49da43c3d4b9fabdbb3fc5c90d552d7c1aa0664eb9c9c11c201f8ee8c34a4b6b2019d13309cc7b3a73fb91d3956ad20690e6fced"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-gnu-hpc-doc"

RDEPENDS:${PN} += "metis_5_1_0-gnu-hpc-doc"

inherit rpm
