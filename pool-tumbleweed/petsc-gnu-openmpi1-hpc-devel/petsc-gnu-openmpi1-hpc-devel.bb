SUMMARY = "Dependency package for petsc_3_18_5-gnu-openmpi1-hpc-devel"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package petsc-gnu-openmpi1-hpc-devel provides the dependency to get binary package petsc_3_18_5-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi1-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-gnu-openmpi1-hpc-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "858104d4ef5716c53aaa2b8b23d9069392b72feaae9e9dbbadd785312832a65e922794f70319b06e0b583fa06ffd0ce838f95e7eb592967b0b7942ea822fcf27"

RPROVIDES:${PN} += "petsc-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "petsc-3-18-5-gnu-openmpi1-hpc-devel"

inherit rpm
