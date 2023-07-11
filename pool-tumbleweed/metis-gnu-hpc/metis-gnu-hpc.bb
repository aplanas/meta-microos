SUMMARY = "Dependency package for metis_5_1_0-gnu-hpc"
DESCRIPTION = "metis: Serial Graph Partitioning and Fill-reducing Matrix Ordering \
The package metis-gnu-hpc provides the dependency to get binary package metis_5_1_0-gnu-hpc. \
When this package gets updated it installs the latest version of metis_5_1_0-gnu-hpc."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-gnu-hpc-5.1.0-9.12.noarch.rpm"
RPM_HASH = "a73091b2b88d26290376069683d368ab4915b84cb48aa65adb2cde414256413d6fc5833b965cb38b58cb17d80f9e58938d8cf63280eea794eb978441f40a6064"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
metis-5-1-0-gnu-hpc"

inherit rpm
