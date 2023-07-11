SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi3-hpc-devel-static"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi3-hpc-devel-static provides the dependency to get binary package adios_1_13_1-gnu-openmpi3-hpc-devel-static. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi3-hpc-devel-static-1.13.1-5.14.noarch.rpm"
RPM_HASH = "1db332b3c04e229b2aa1416bb2576f4bd96b14e688a004206845f37e40ae1ca924eb157696f814b41caed2e3d52badf0c89bae82a4f5aa9b467aae9c3eae716b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi3-hpc-devel-static"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-openmpi3-hpc-devel-static"

inherit rpm
