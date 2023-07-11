SUMMARY = "Dependency package for petsc_3_18_5-gnu-openmpi4-hpc-devel"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package petsc-gnu-openmpi4-hpc-devel provides the dependency to get binary package petsc_3_18_5-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi4-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-gnu-openmpi4-hpc-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "5c322f158e89a5c6ba69823773660f6b46760457baed3ae92f27971aee9281eca92fab4689345404c2f3df41983a3324775f5426f6786e1d6880ffb61a62581f"

RPROVIDES:${PN} += "petsc-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "petsc-3-18-5-gnu-openmpi4-hpc-devel"

inherit rpm
