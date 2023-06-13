SUMMARY = "Dependency package for libpetsc_3_18_5-gnu-openmpi1-hpc"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package libpetsc-gnu-openmpi1-hpc provides the dependency to get binary package libpetsc_3_18_5-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi1-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc-gnu-openmpi1-hpc-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "5818a50aaf5d7e5ad300605707dec9cc217ae6ef8912141f4bfb70c84ec4ccc96287b4954903ba3d7cd7a81adb5e11b99c3ec4be75ccb3c7a1d0f688cf7657e9"

RPROVIDES:${PN} += "libpetsc-gnu-openmpi1-hpc \
libpetsc-gnu-openmpi1-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libpetsc_3_18_5-gnu-openmpi1-hpc"

inherit rpm
