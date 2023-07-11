SUMMARY = "Dependency package for petsc_3_18_5-gnu-mpich-hpc-devel"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package petsc-gnu-mpich-hpc-devel provides the dependency to get binary package petsc_3_18_5-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-mpich-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-gnu-mpich-hpc-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "7be2678694f309f1b2002e0e8262527326fd5dc3dd3ea6bf7c0b658a92e0b7bd20a2859ffa8333e823baa10ee779ba901990df3470cf7096ac5faafefbba0305"

RPROVIDES:${PN} += "petsc-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "petsc-3-18-5-gnu-mpich-hpc-devel"

inherit rpm
