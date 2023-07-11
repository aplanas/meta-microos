SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi4-hpc"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi4-hpc provides the dependency to get binary package adios_1_13_1-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi4-hpc-1.13.1-5.15.noarch.rpm"
RPM_HASH = "122c2e3d9a443e84e41bd50f76104d09784da9ad776379a95ddd3907279be4fc5007a8873e2118564ccaf69f634cdacfbda7975b2c25d0e35b69ca70ec13268d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-openmpi4-hpc"

inherit rpm
