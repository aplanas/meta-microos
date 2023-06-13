SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi3-hpc-devel-static"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi3-hpc-devel-static provides the dependency to get binary package adios_1_13_1-gnu-openmpi3-hpc-devel-static. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi3-hpc-devel-static-1.13.1-5.13.noarch.rpm"
RPM_HASH = "d227ed741bce9557c82a3acd8f8aa0594f4e64319a90f878967420c591d9949785282d1a6608c5d82413a5c86f6feeef18fce09af0bd088105a239c58336e5d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi3-hpc-devel-static"

RDEPENDS:${PN} += "/bin/sh \
adios_1_13_1-gnu-openmpi3-hpc-devel-static"

inherit rpm
