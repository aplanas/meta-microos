SUMMARY = "Dependency package for libmetis_5_1_0-gnu-hpc"
DESCRIPTION = "metis: Serial Graph Partitioning and Fill-reducing Matrix Ordering \
The package libmetis-gnu-hpc provides the dependency to get binary package libmetis_5_1_0-gnu-hpc. \
When this package gets updated it installs the latest version of metis_5_1_0-gnu-hpc."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "libmetis-gnu-hpc-5.1.0-9.12.aarch64.rpm"
RPM_HASH = "c46d87e8ea80ae1bab32ebc4a4984e2aa933714a3e3d43f6c6d1fb3e47391bbbba9bd4bc9cbdb17c4aaa712ffbbe2cb4160ec9ecec4a9802c2609282c21400a6"

RPROVIDES:${PN} += "libmetis-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libmetis-5-1-0-gnu-hpc"

inherit rpm
