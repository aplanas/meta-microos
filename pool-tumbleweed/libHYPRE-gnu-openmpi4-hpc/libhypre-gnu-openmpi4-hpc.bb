SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi4-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi4-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi4-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi4-hpc-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "012ba0b2596c421ccf3858e8e923b22d20c81177a12a1f5b553a775c35d4663e4f2c7c934ea73ce070bd0bfaf8f1412a29a497ffe7b4ea20ad79bb6a630957c9"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libHYPRE-2-20-0-gnu-openmpi4-hpc"

inherit rpm
