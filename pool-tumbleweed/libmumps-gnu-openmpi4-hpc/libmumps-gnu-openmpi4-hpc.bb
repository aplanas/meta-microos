SUMMARY = "Dependency package for libmumps_5_3_5-gnu-openmpi4-hpc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package libmumps-gnu-openmpi4-hpc provides the dependency to get binary package libmumps_5_3_5-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-gnu-openmpi4-hpc-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "0f6ac63b93edf4af179bffc401f1720b289e27591f24eab7502efc7bee6246280cb3b2dc900c487f89a6956619abe42241a9745969b460de98d81b835718d5a0"

RPROVIDES:${PN} += "libmumps-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libmumps-5-3-5-gnu-openmpi4-hpc"

inherit rpm
