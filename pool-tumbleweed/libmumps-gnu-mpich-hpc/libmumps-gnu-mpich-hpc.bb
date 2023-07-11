SUMMARY = "Dependency package for libmumps_5_3_5-gnu-mpich-hpc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package libmumps-gnu-mpich-hpc provides the dependency to get binary package libmumps_5_3_5-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-gnu-mpich-hpc-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "6f0e116f141a51e915d92e0c1d5ebb65bd6466ceb3fa29e8b36efce92a0312106ba56dc1bfb400764857c1792aa24c1b7eecee70d297a9c7d6e184d65aac2f8d"

RPROVIDES:${PN} += "libmumps-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libmumps-5-3-5-gnu-mpich-hpc"

inherit rpm
