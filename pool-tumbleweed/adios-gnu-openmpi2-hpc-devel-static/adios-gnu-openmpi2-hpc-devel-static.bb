SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi2-hpc-devel-static"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi2-hpc-devel-static provides the dependency to get binary package adios_1_13_1-gnu-openmpi2-hpc-devel-static. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi2-hpc-devel-static-1.13.1-5.14.noarch.rpm"
RPM_HASH = "6b5be3cfedd3dbe632207d4af4610161dfafdef3005c4ae2a70242a96b473709ab7ad213b1e1dd41271773dddd559e4701c6d6b0ea9b8e3b929769223f527d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi2-hpc-devel-static"

RDEPENDS:${PN} += "/bin/sh \
adios_1_13_1-gnu-openmpi2-hpc-devel-static"

inherit rpm
