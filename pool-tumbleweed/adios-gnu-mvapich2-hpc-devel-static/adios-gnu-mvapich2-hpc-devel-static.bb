SUMMARY = "Dependency package for adios_1_13_1-gnu-mvapich2-hpc-devel-static"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-mvapich2-hpc-devel-static provides the dependency to get binary package adios_1_13_1-gnu-mvapich2-hpc-devel-static. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-mvapich2-hpc-devel-static-1.13.1-5.15.noarch.rpm"
RPM_HASH = "c17f167b071533843b9829f6d325758dd7a676549d0d605db4b3da7929a8cce16461209cb52612668ea18488808c2286acf7de59a02db48bccf67c1f36240763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-mvapich2-hpc-devel-static"

inherit rpm
