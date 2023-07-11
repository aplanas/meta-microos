SUMMARY = "Dependency package for libpetsc_3_18_5-gnu-openmpi4-hpc"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package libpetsc-gnu-openmpi4-hpc provides the dependency to get binary package libpetsc_3_18_5-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi4-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc-gnu-openmpi4-hpc-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "a598d0ab4e2a00e7358b30fa6c5d73d59552179040560156b752eddfb666b4cf8642f6252e1b2e67294adf255df5662ce58cfc35eeb1830f4eb24edf4c83de6d"

RPROVIDES:${PN} += "libpetsc-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpetsc-3-18-5-gnu-openmpi4-hpc"

inherit rpm
