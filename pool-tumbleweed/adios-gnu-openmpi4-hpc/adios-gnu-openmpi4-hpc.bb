SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi4-hpc"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi4-hpc provides the dependency to get binary package adios_1_13_1-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi4-hpc-1.13.1-5.14.noarch.rpm"
RPM_HASH = "c02314f083ee3f9a5a845e8945a63528b1d3a971aa3233404a4e2fb444d41bf6cf966699e154f9a8e3930d7507e6eee176efc2b6bb92784cd10194f6255ff886"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/bin/sh \
adios-1-13-1-gnu-openmpi4-hpc"

inherit rpm
