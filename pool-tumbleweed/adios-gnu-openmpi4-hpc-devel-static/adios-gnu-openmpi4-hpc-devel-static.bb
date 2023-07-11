SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi4-hpc-devel-static"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi4-hpc-devel-static provides the dependency to get binary package adios_1_13_1-gnu-openmpi4-hpc-devel-static. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi4-hpc-devel-static-1.13.1-5.15.noarch.rpm"
RPM_HASH = "ef7f822d3ccbbf7d5e4905f5c1fc1eb7a542a2477a1dfc304ce9e57b54ae8b90471e08f9bfebfd568bdb5db8cd757490f1dc6b1259f9118833f7f7eb07585a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi4-hpc-devel-static"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-openmpi4-hpc-devel-static"

inherit rpm
