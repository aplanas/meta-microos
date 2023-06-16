SUMMARY = "Dependency package for libmetis_5_1_0-gnu-hpc"
DESCRIPTION = "metis: Serial Graph Partitioning and Fill-reducing Matrix Ordering \
The package libmetis-gnu-hpc provides the dependency to get binary package libmetis_5_1_0-gnu-hpc. \
When this package gets updated it installs the latest version of metis_5_1_0-gnu-hpc."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "libmetis-gnu-hpc-5.1.0-9.11.aarch64.rpm"
RPM_HASH = "2ca96c8cc887331c2d02ab77ac5f53b31bd7a2773f5ef5eb796e37d50c720dcda26a78a7aecc39e6daa021fa0a0af1270ccc3d4db9b3a02c9494e582de7279a1"

RPROVIDES:${PN} += "libmetis-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libmetis-5-1-0-gnu-hpc"

inherit rpm
