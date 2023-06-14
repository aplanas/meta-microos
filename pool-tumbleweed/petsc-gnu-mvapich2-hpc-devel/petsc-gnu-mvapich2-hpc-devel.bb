SUMMARY = "Dependency package for petsc_3_18_5-gnu-mvapich2-hpc-devel"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package petsc-gnu-mvapich2-hpc-devel provides the dependency to get binary package petsc_3_18_5-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-mvapich2-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-gnu-mvapich2-hpc-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "631ebb8549ccfbda7b6c13219481da0d5b09422ee949d595cbf3923e39fb305752c72075177506e7be6fd895777dfbdd41216220910efe817245d15bb48cad04"

RPROVIDES:${PN} += "petsc-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "petsc-3-18-5-gnu-mvapich2-hpc-devel"

inherit rpm
