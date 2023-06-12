SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi1-hpc-devel-static"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi1-hpc-devel-static provides the dependency to get binary package adios_1_13_1-gnu-openmpi1-hpc-devel-static. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi1-hpc-devel-static-1.13.1-5.13.noarch.rpm"
RPM_HASH = "6fc3935f9194bf494bbc38d630faf5f68cef16933e6155ad91aa31332eba3e2892076032864f456e4a6120f655dc4bce90f6ff1437c914aca367800cdcf7f4b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi1-hpc-devel-static"
RDEPENDS:${PN} += "/bin/sh \
adios_1_13_1-gnu-openmpi1-hpc-devel-static"

inherit rpm
