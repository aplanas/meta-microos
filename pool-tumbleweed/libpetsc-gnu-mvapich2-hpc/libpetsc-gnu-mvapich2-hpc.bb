SUMMARY = "Dependency package for libpetsc_3_18_5-gnu-mvapich2-hpc"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package libpetsc-gnu-mvapich2-hpc provides the dependency to get binary package libpetsc_3_18_5-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-mvapich2-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc-gnu-mvapich2-hpc-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "602e792100fdef821489e82f9be50591e8a4bdb165de65286432fc506dbab752cc9bc0801c6c02e85f283433c6a2c15108a94b8531a2a376cfbece5d6d17f905"

RPROVIDES:${PN} += "libpetsc-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpetsc-3-18-5-gnu-mvapich2-hpc"

inherit rpm
