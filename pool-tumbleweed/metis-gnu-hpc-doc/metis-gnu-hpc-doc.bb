SUMMARY = "Dependency package for metis_5_1_0-gnu-hpc-doc"
DESCRIPTION = "metis: Serial Graph Partitioning and Fill-reducing Matrix Ordering \
The package metis-gnu-hpc-doc provides the dependency to get binary package metis_5_1_0-gnu-hpc-doc. \
When this package gets updated it installs the latest version of metis_5_1_0-gnu-hpc."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-gnu-hpc-doc-5.1.0-9.12.noarch.rpm"
RPM_HASH = "b53029105369427cc535df9d7143b44baf342e2700521ea3a3dc9215e61dfd6dd1a335e1f2133888a946c32385a004f4bb75366d92fa83e2fd3293cf6b1fae34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-gnu-hpc-doc"

RDEPENDS:${PN} += "metis-5-1-0-gnu-hpc-doc"

inherit rpm
