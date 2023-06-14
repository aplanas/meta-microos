SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi1-hpc"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi1-hpc provides the dependency to get binary package adios_1_13_1-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi1-hpc-1.13.1-5.13.noarch.rpm"
RPM_HASH = "c71830267409b6649a16f1c7ff239b1cc556daaa7a078f6b6203df61839693dceb225f3a564a3752f8fe81990b899e282da8e1f459563b49f472cfcd1035f220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/bin/sh \
adios-1-13-1-gnu-openmpi1-hpc"

inherit rpm
