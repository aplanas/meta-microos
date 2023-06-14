SUMMARY = "Dependency package for adios_1_13_1-gnu-mvapich2-hpc"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-mvapich2-hpc provides the dependency to get binary package adios_1_13_1-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-mvapich2-hpc-1.13.1-5.14.noarch.rpm"
RPM_HASH = "ead3d0dc89dcaef1d0e5dfd34e3aabd9406d936a50ee64793ac9577980ea8cd5977ead4196cbb4cf862d076af9f27fd08aad8ebea1f04adc530761895249ff95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/bin/sh \
adios-1-13-1-gnu-mvapich2-hpc"

inherit rpm
