SUMMARY = "Dependency package for metis_5_1_0-gnu-hpc-examples"
DESCRIPTION = "metis: Serial Graph Partitioning and Fill-reducing Matrix Ordering \
The package metis-gnu-hpc-examples provides the dependency to get binary package metis_5_1_0-gnu-hpc-examples. \
When this package gets updated it installs the latest version of metis_5_1_0-gnu-hpc."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-gnu-hpc-examples-5.1.0-9.12.noarch.rpm"
RPM_HASH = "ff938e5dd1c416cc19a05754d661801d7d384ac45dfb804617ebc22bbde0e922c849209fea4caa351a04081d02dceb256c15a157e37cdb32c7ce07d7af18238b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-gnu-hpc-examples"

RDEPENDS:${PN} += "metis-5-1-0-gnu-hpc-examples"

inherit rpm
