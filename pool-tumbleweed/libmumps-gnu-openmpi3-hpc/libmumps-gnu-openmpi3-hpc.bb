SUMMARY = "Dependency package for libmumps_5_3_5-gnu-openmpi3-hpc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package libmumps-gnu-openmpi3-hpc provides the dependency to get binary package libmumps_5_3_5-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-gnu-openmpi3-hpc-5.3.5-3.2.aarch64.rpm"
RPM_HASH = "c503af3ec5ce42860fd4fba068254ff1fc79defcae20218f975bf6b773b1e747c3299dd3781acde93c1d4542cd2b852e376ecb84b61d8d6e6c0d513d2974fb41"

RPROVIDES:${PN} += "libmumps-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/bin/sh \
libmumps-5-3-5-gnu-openmpi3-hpc"

inherit rpm
