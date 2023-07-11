SUMMARY = "Dependency package for petsc_3_18_5-gnu-openmpi2-hpc-devel"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package petsc-gnu-openmpi2-hpc-devel provides the dependency to get binary package petsc_3_18_5-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi2-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-gnu-openmpi2-hpc-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "6e7e29d7685b15b6414cdb4cc49da993b40e4f10eff10f98ba7583c7ed5f9a0a97ccde281fabd1a17e088bb45b610ce8bbd68f658f2fa9cd53567ad0e9737dfa"

RPROVIDES:${PN} += "petsc-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "petsc-3-18-5-gnu-openmpi2-hpc-devel"

inherit rpm
