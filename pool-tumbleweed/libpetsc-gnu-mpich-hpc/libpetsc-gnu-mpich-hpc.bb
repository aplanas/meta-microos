SUMMARY = "Dependency package for libpetsc_3_18_5-gnu-mpich-hpc"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package libpetsc-gnu-mpich-hpc provides the dependency to get binary package libpetsc_3_18_5-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-mpich-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc-gnu-mpich-hpc-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "92313834cb81f7ed8bc26b175bc7a5a7c5046ccbc6435d6b45d96ff7483018369b0885e32521c1b66513044454c91e478ec11c324621a12e2e50aa66f81e0313"

RPROVIDES:${PN} += "libpetsc-gnu-mpich-hpc"

RDEPENDS:${PN} += "/bin/sh \
libpetsc-3-18-5-gnu-mpich-hpc"

inherit rpm
