SUMMARY = "Dependency package for petsc_3_18_5-gnu-openmpi3-hpc-devel"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package petsc-gnu-openmpi3-hpc-devel provides the dependency to get binary package petsc_3_18_5-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi3-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-gnu-openmpi3-hpc-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "2f885ac54548ba12812b73ffd29189e73a28ab9e5b474315d29fb97c10738e2de21f3f79d86214b72e9b0a6ac3058f57c5cce6948580ac290bd45af2166070ea"

RPROVIDES:${PN} += "petsc-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "petsc-3-18-5-gnu-openmpi3-hpc-devel"

inherit rpm
