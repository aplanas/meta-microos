SUMMARY = "Dependency package for libpetsc_3_18_5-gnu-openmpi3-hpc"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package libpetsc-gnu-openmpi3-hpc provides the dependency to get binary package libpetsc_3_18_5-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi3-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc-gnu-openmpi3-hpc-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "eb767484d51b9391578aa34238c853d35b419c45ca82b3706760d4ddce49758d1eb19045b72bf248b1a1d5b86aabb4a077398ce277360418341357d468a164a1"

RPROVIDES:${PN} += "libpetsc-gnu-openmpi3-hpc \
libpetsc-gnu-openmpi3-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libpetsc_3_18_5-gnu-openmpi3-hpc"

inherit rpm
