SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi3-hpc-devel"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi3-hpc-devel provides the dependency to get binary package adios_1_13_1-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi3-hpc-devel-1.13.1-5.14.noarch.rpm"
RPM_HASH = "8345fd6879d8dfe7f9e72fd7ac9d7ae15ab26049786761db0affec6a07d24f77f35e57a9960dfe7c74f8e133aa94a52008bdca4998d4cf9b7c85c246345a86b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-openmpi3-hpc-devel"

inherit rpm
