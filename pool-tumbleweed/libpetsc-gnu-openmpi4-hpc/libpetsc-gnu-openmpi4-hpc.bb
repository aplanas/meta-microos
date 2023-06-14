SUMMARY = "Dependency package for libpetsc_3_18_5-gnu-openmpi4-hpc"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package libpetsc-gnu-openmpi4-hpc provides the dependency to get binary package libpetsc_3_18_5-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi4-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc-gnu-openmpi4-hpc-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "6671ea7705b365271c04b1806617031a9a2dd9db17d158485edecccdfe9467c2e169412705b731b7405ac2d44c3aec2042e56a5eac9c61a149b80a94d02b7ce4"

RPROVIDES:${PN} += "libpetsc-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/bin/sh \
libpetsc-3-18-5-gnu-openmpi4-hpc"

inherit rpm
