SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi3-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi3-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi3-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi3-hpc-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "5ffd133a0d5520213c65ccb85e368dbea06b95e5d41143d3bd3cb8b8c79ad1c9c127c58bfa574c40a96752cefaa968f1ffc4880b47ba147ce693f773c4069952"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libHYPRE-2-20-0-gnu-openmpi3-hpc"

inherit rpm
