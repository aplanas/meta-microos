SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi2-hpc-devel"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi2-hpc-devel provides the dependency to get binary package adios_1_13_1-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi2-hpc-devel-1.13.1-5.14.noarch.rpm"
RPM_HASH = "a472d0f912700ca78e9354604d433c05e65f684b21b73f8d5ca8692f07cb82054fe213cf5cf16200799ec7fbfea7b923da29ec416a070b4c2723b8b59c8ced8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
adios_1_13_1-gnu-openmpi2-hpc-devel"

inherit rpm
