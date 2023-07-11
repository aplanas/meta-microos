SUMMARY = "Dependency package for adios_1_13_1-gnu-mvapich2-hpc"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-mvapich2-hpc provides the dependency to get binary package adios_1_13_1-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-mvapich2-hpc-1.13.1-5.15.noarch.rpm"
RPM_HASH = "9cd5bfa2060fe03deb3ffc133b2e3fc0ad4d42280b1ddbe0433079e99b40e3d399c956dda9b2b9deb78eca47f591646499313baffde6f0711d5d616d49f78636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-mvapich2-hpc"

inherit rpm
