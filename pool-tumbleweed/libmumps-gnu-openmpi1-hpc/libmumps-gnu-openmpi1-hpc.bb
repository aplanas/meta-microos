SUMMARY = "Dependency package for libmumps_5_3_5-gnu-openmpi1-hpc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package libmumps-gnu-openmpi1-hpc provides the dependency to get binary package libmumps_5_3_5-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-gnu-openmpi1-hpc-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "9acc976316c34530c6c6aee0a93f60213bbbcf686c1b5c1a488604c8daad00cefa347535629a6c21ced6d2ee5362b7f453441596fdffed1b05fe7fd89ac4ec18"

RPROVIDES:${PN} += "libmumps-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libmumps-5-3-5-gnu-openmpi1-hpc"

inherit rpm
