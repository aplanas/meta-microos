SUMMARY = "Dependency package for petsc_3_18_5-gnu-mpich-hpc-devel"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package petsc-gnu-mpich-hpc-devel provides the dependency to get binary package petsc_3_18_5-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-mpich-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-gnu-mpich-hpc-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "1d61714331c7f3607bc9fca31cbf997282f9d227254cf119ca5ef0b1c20b8773dea5712f3b91be20e88c8a38744e3a5c4ea813a929bcd84cd92cf0a826c8a1d8"

RPROVIDES:${PN} += "petsc-gnu-mpich-hpc-devel \
petsc-gnu-mpich-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "petsc_3_18_5-gnu-mpich-hpc-devel"

inherit rpm
