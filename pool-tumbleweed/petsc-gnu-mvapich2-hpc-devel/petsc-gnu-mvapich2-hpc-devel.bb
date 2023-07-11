SUMMARY = "Dependency package for petsc_3_18_5-gnu-mvapich2-hpc-devel"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package petsc-gnu-mvapich2-hpc-devel provides the dependency to get binary package petsc_3_18_5-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-mvapich2-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-gnu-mvapich2-hpc-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "d9423d8ef44f56d37ea3e858e4f26b8041fa3471fe4a3ab6654a8dbe9998d28b6cac99ba864f932854621e85c983c282c93c37e0b2bd08c4bfa62e18d7e652f3"

RPROVIDES:${PN} += "petsc-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "petsc-3-18-5-gnu-mvapich2-hpc-devel"

inherit rpm
