SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi4-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi4-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi4-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi4-hpc-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "5131414456169266f78541769dec785241034ac4389195f5e6090cf84c57e516ed0d151358b7e4525f40dd732248c2525a8a6f74460b77b5fa59ed621a1e6ca3"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/bin/sh \
libHYPRE-2-20-0-gnu-openmpi4-hpc"

inherit rpm
