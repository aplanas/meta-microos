SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi1-hpc-devel"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi1-hpc-devel provides the dependency to get binary package adios_1_13_1-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi1-hpc-devel-1.13.1-5.13.noarch.rpm"
RPM_HASH = "9ffe15f87fdd97010bc0b752af2a80ff136c9c3a160985b639227513ad0b8737e1cc867c2f7b1fa3e92c5e2c5b280e99b8c1974e5b808f139c0061458cc3db7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
adios-1-13-1-gnu-openmpi1-hpc-devel"

inherit rpm
