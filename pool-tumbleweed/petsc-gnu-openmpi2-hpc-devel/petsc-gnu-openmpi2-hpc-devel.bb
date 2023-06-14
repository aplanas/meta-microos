SUMMARY = "Dependency package for petsc_3_18_5-gnu-openmpi2-hpc-devel"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package petsc-gnu-openmpi2-hpc-devel provides the dependency to get binary package petsc_3_18_5-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi2-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-gnu-openmpi2-hpc-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "6cdf8acaf3a8de1ee1901275d07162fe599ef00f86c6ac40dd598f292200966f6daa7f0ecd9c30420b69a3ad25f7744c76184abeb502578515a19642b0aac24a"

RPROVIDES:${PN} += "petsc-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "petsc-3-18-5-gnu-openmpi2-hpc-devel"

inherit rpm
