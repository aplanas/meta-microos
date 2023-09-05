SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi3-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi3-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi3-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi3-hpc-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "5bccb1f5e4b8b7098911f8b1597bd5ba347992d290496d5812755dd413404302a6aa3075371e89d57c682011993efdf9f9c470accc4abb4ea1ca5055f51878fc"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libHYPRE-2-20-0-gnu-openmpi3-hpc"

inherit rpm
