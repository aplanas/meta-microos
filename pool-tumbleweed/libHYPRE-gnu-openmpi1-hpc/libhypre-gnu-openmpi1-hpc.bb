SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi1-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi1-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi1-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi1-hpc-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "441f9dc350597a304fa99664694ca630f1984b6e334808a0a13353d5ab251e5b5844c076ac06f59aa4e42314e2b0ec02d6a95920eecfbc9118ce115d11099757"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libHYPRE-2-20-0-gnu-openmpi1-hpc"

inherit rpm
