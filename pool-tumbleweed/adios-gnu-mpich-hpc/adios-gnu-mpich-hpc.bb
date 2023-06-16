SUMMARY = "Dependency package for adios_1_13_1-gnu-mpich-hpc"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-mpich-hpc provides the dependency to get binary package adios_1_13_1-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-mpich-hpc-1.13.1-5.14.noarch.rpm"
RPM_HASH = "2d635dd59d7b4bf40998dca8ff69b3581ee291f6da9d57c5ee2526cef34204575519fa6d7a227fc23b91970021a04948e0bbeff936aa044f0475ecec653afb77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-mpich-hpc"

inherit rpm
