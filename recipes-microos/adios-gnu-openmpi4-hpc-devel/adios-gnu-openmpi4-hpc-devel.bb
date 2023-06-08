SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi4-hpc-devel"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi4-hpc-devel provides the dependency to get binary package adios_1_13_1-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi4-hpc-devel-1.13.1-5.14.noarch.rpm"
RPM_HASH = "2e70721c7bd8be353c3d44262d4def89ffb0728c5ed7726b2519897852f68f35d8989f9707279bfffa00d92c9e64796dd431d9e40c919dcfd7050aa6a841d613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi4-hpc-devel"
RDEPENDS:${PN} += "/bin/sh adios_1_13_1-gnu-openmpi4-hpc-devel"

inherit rpm
