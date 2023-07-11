SUMMARY = "Dependency package for libmumps_5_3_5-gnu-openmpi3-hpc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package libmumps-gnu-openmpi3-hpc provides the dependency to get binary package libmumps_5_3_5-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-gnu-openmpi3-hpc-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "f3aecd4ff74dd2b167c40d261da0d8e27b5893ec634ef7510f786d0f5503bde1af8846497e471e384e19566ac3ffb420179dec8271c0a2eced972c0c1a14d43a"

RPROVIDES:${PN} += "libmumps-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libmumps-5-3-5-gnu-openmpi3-hpc"

inherit rpm
