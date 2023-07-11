SUMMARY = "Dependency package for adios_1_13_1-gnu-mpich-hpc-devel-static"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-mpich-hpc-devel-static provides the dependency to get binary package adios_1_13_1-gnu-mpich-hpc-devel-static. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-mpich-hpc-devel-static-1.13.1-5.15.noarch.rpm"
RPM_HASH = "0279cc80cf1f2f61f5161fa887ff73350b60acdc2831df59b6137a004bb54fac833388f10d3ee4efc12454fc060824963686a70e43ad70c1d91d668c407c45d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-mpich-hpc-devel-static"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-mpich-hpc-devel-static"

inherit rpm
