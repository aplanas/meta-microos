SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi1-hpc-devel"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi1-hpc-devel provides the dependency to get binary package adios_1_13_1-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi1-hpc-devel-1.13.1-5.14.noarch.rpm"
RPM_HASH = "af15818df330cd76638c92cadb148eac2745b0275893ec23ea5c15ffd0af8ee4dc12979e460d7374f243975cdd427874b1f60c9d90199284c0a5bc130861d037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-openmpi1-hpc-devel"

inherit rpm
