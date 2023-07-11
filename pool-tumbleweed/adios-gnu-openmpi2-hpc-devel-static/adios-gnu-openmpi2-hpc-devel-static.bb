SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi2-hpc-devel-static"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi2-hpc-devel-static provides the dependency to get binary package adios_1_13_1-gnu-openmpi2-hpc-devel-static. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi2-hpc-devel-static-1.13.1-5.15.noarch.rpm"
RPM_HASH = "685880ca2ada418252b3be7f67c7c21399c10cefcd5962ce3b1b0cded5e3d25b3881086c4d65e55513d6a559a6355a5e71d3b4674020e8b14544c078e5aec91c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi2-hpc-devel-static"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-openmpi2-hpc-devel-static"

inherit rpm
