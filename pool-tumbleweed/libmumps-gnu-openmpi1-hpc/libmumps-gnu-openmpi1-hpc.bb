SUMMARY = "Dependency package for libmumps_5_3_5-gnu-openmpi1-hpc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package libmumps-gnu-openmpi1-hpc provides the dependency to get binary package libmumps_5_3_5-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-gnu-openmpi1-hpc-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "7618d6c2cfc51b6299ecf0499857e909b364ff010b39dc14bb6c3f27ea82a21e257b3bb7f48c85dfb54557c748e99fd70237304b4ab2d550ba799cf51623f065"

RPROVIDES:${PN} += "libmumps-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/bin/sh \
libmumps-5-3-5-gnu-openmpi1-hpc"

inherit rpm
