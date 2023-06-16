SUMMARY = "Dependency package for adios_1_13_1-gnu-mvapich2-hpc-devel"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-mvapich2-hpc-devel provides the dependency to get binary package adios_1_13_1-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-mvapich2-hpc-devel-1.13.1-5.14.noarch.rpm"
RPM_HASH = "929eec25a47d5541547e71aa94d47a601c5af73bcb8f0debdaa3145745b1714e834bd7d273817e011101319ead91a04fd755713d71027ef65b9c08aaf3dd8143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-mvapich2-hpc-devel"

inherit rpm
