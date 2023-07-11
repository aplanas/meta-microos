SUMMARY = "Dependency package for libpetsc_3_18_5-gnu-openmpi2-hpc"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package libpetsc-gnu-openmpi2-hpc provides the dependency to get binary package libpetsc_3_18_5-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi2-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc-gnu-openmpi2-hpc-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "a07b76d8161d9d581c27df91fff75018f9d687e079da0173df9c084421547d62b7ca2b93a1aebd37a4f59423a08b9fa45d012c2dc9c50ce86f7c0ee790607d15"

RPROVIDES:${PN} += "libpetsc-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpetsc-3-18-5-gnu-openmpi2-hpc"

inherit rpm
