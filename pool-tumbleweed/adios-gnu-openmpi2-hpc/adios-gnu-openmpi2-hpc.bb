SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi2-hpc"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi2-hpc provides the dependency to get binary package adios_1_13_1-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi2-hpc-1.13.1-5.14.noarch.rpm"
RPM_HASH = "8b6d15f9c3ee7c5e50e099933e18c6aa41ba538412f7ce320bc5bb42d43c4cfcc575c8c414f78ab9cb77ca1a0bacb5e00c85cff98e03c69ccb834af0fd853558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/bin/sh \
adios-1-13-1-gnu-openmpi2-hpc"

inherit rpm
