SUMMARY = "Dependency package for metis_5_1_0-gnu-hpc-examples"
DESCRIPTION = "metis: Serial Graph Partitioning and Fill-reducing Matrix Ordering \
The package metis-gnu-hpc-examples provides the dependency to get binary package metis_5_1_0-gnu-hpc-examples. \
When this package gets updated it installs the latest version of metis_5_1_0-gnu-hpc."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-gnu-hpc-examples-5.1.0-9.11.noarch.rpm"
RPM_HASH = "19213d8d923fe3ab99822f190561483753db6612746436aeac7f6af3138e768750013aa9cf6dc4da2ed4fecc0ce9b10cfa8e6873e74a28d92c712e800baf0864"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-gnu-hpc-examples"

RDEPENDS:${PN} += "metis_5_1_0-gnu-hpc-examples"

inherit rpm
