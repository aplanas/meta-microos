SUMMARY = "Dependency package for petsc_3_18_5-gnu-openmpi1-hpc-devel"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package petsc-gnu-openmpi1-hpc-devel provides the dependency to get binary package petsc_3_18_5-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi1-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-gnu-openmpi1-hpc-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "7be036a05b045b97300ceb2007f4807a8b6895a51343c307cf2dbcd33c19fd80a05ff7afe9cafb6e8ab0f2a341e22a22bf6324f9fefe3b86c14c4e3d064d57fe"

RPROVIDES:${PN} += "petsc-gnu-openmpi1-hpc-devel \
petsc-gnu-openmpi1-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "petsc_3_18_5-gnu-openmpi1-hpc-devel"

inherit rpm
