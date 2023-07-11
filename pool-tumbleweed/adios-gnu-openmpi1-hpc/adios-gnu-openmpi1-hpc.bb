SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi1-hpc"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi1-hpc provides the dependency to get binary package adios_1_13_1-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi1-hpc-1.13.1-5.14.noarch.rpm"
RPM_HASH = "278264ed5697d630656c17dca7e57ca0486c330c839a87f6c728ff2176040844311198e1a8d00dbf98d0c90d1501a0cd17fb5bb2901ac9fdda353d03f1a1eb7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-openmpi1-hpc"

inherit rpm
