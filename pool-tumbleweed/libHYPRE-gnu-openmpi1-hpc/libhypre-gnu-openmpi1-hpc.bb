SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi1-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi1-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi1-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi1-hpc-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "52f8875a8e39866d78ead744589b131a7a11c57d47ee358d3990d17fb804a7591bdb53a79fc18b6012928095f5c1cfe34d183ff330928aee99632bbb5127f485"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libHYPRE-2-20-0-gnu-openmpi1-hpc"

inherit rpm
