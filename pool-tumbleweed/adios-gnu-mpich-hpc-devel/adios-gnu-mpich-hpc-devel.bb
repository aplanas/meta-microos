SUMMARY = "Dependency package for adios_1_13_1-gnu-mpich-hpc-devel"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-mpich-hpc-devel provides the dependency to get binary package adios_1_13_1-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-mpich-hpc-devel-1.13.1-5.14.noarch.rpm"
RPM_HASH = "77b528b08c4f629436c270d200b9bf0df4254a2d2067a408fcae60d093cfe68b53dc1396519910beba682f0ffdf4efe37b8c2ef32e6397c9116ccde773d5467e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-mpich-hpc-devel"
RDEPENDS:${PN} += "/bin/sh \
adios_1_13_1-gnu-mpich-hpc-devel"

inherit rpm
