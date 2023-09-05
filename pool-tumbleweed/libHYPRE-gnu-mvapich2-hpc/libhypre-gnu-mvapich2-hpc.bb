SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-mvapich2-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-mvapich2-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mvapich2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-mvapich2-hpc-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "f0bccf1687a4474f6d0dd572fbd15e06d002216cba708486b2f8d58de7adcb2f24fe6038f9c30219f0b6d96051ff7ea7d9bd64fa6ac3e7fd584d91c22d26ca22"

RPROVIDES:${PN} += "libHYPRE-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libHYPRE-2-20-0-gnu-mvapich2-hpc"

inherit rpm
