SUMMARY = "Dependency package for metis_5_1_0-gnu-hpc-devel"
DESCRIPTION = "metis: Serial Graph Partitioning and Fill-reducing Matrix Ordering \
The package metis-gnu-hpc-devel provides the dependency to get binary package metis_5_1_0-gnu-hpc-devel. \
When this package gets updated it installs the latest version of metis_5_1_0-gnu-hpc."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-gnu-hpc-devel-5.1.0-9.12.noarch.rpm"
RPM_HASH = "6a808ba9797e008a03f406226a32e8abaf78ed693163db3bc34e95afa4825c8c6287c40ea8dbb06fce6e68f63943949af0a83361b430309623e141f7c50018b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
metis-5-1-0-gnu-hpc-devel"

inherit rpm
