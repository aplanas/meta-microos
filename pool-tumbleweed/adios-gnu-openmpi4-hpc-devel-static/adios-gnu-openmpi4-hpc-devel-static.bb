SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi4-hpc-devel-static"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi4-hpc-devel-static provides the dependency to get binary package adios_1_13_1-gnu-openmpi4-hpc-devel-static. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi4-hpc-devel-static-1.13.1-5.14.noarch.rpm"
RPM_HASH = "dbb97bba790c3b60251ca3ca962034d5a661fb2b76bc51ba35e24104be18721ee61614d12dbaac9f807d3a06bbaecb983d10ad612777bc30a8d07e21384ffef2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi4-hpc-devel-static"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-openmpi4-hpc-devel-static"

inherit rpm
