SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi3-hpc-devel"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi3-hpc-devel provides the dependency to get binary package adios_1_13_1-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi3-hpc-devel-1.13.1-5.13.noarch.rpm"
RPM_HASH = "57edb4a7537bcf928d20377e9fef12b632985786d107501ae87bed73cd6913b7659b21b77f10039cd27234d54fb041a1302b8e46021f1fa9a4ef50f2512f1635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-openmpi3-hpc-devel"

inherit rpm
