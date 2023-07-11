SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi2-hpc"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi2-hpc provides the dependency to get binary package adios_1_13_1-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi2-hpc-1.13.1-5.15.noarch.rpm"
RPM_HASH = "e35352977ce419566d7f409e1f525ae501ae5d7b4313cfc86852a56f76fabea881ee0a08cbdd0634486cae800336125e046b29dc82cd28584777b64b19b12153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-openmpi2-hpc"

inherit rpm
