SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi1-hpc-devel-static"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi1-hpc-devel-static provides the dependency to get binary package adios_1_13_1-gnu-openmpi1-hpc-devel-static. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi1-hpc-devel-static-1.13.1-5.14.noarch.rpm"
RPM_HASH = "e63e84630df6b1eb062e349bb16e46c033332556150f065e9d2eb46ad2c2edc3834ff73688e3df6c9286373097a9c88d0a967db8de6719d97fe96b34afb7b6d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi1-hpc-devel-static"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-openmpi1-hpc-devel-static"

inherit rpm
