SUMMARY = "Dependency package for libpetsc_3_18_5-gnu-openmpi3-hpc"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package libpetsc-gnu-openmpi3-hpc provides the dependency to get binary package libpetsc_3_18_5-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi3-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc-gnu-openmpi3-hpc-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "83f9d50779086129900618a9cc3cfae7baf06762662d42c851bf7d50ce1bc33dfad3b2e9077b9173ee406b2a49bed070bc338b688e70935bcce7f11bb1546884"

RPROVIDES:${PN} += "libpetsc-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpetsc-3-18-5-gnu-openmpi3-hpc"

inherit rpm
