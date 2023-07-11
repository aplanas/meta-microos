SUMMARY = "Dependency package for adios_1_13_1-gnu-mvapich2-hpc-devel"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-mvapich2-hpc-devel provides the dependency to get binary package adios_1_13_1-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-mvapich2-hpc-devel-1.13.1-5.15.noarch.rpm"
RPM_HASH = "b3afbf051a27cf1fefea7afa947cd7962944ff0d56a9f3d76756f4d90a69c50af60c8ea719ea1ecfc45a10d114e88be1d75d0a45edd26b3f8aebc32c67c165cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-mvapich2-hpc-devel"

inherit rpm
