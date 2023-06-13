SUMMARY = "Dependency package for adios_1_13_1-gnu-mvapich2-hpc-devel-static"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-mvapich2-hpc-devel-static provides the dependency to get binary package adios_1_13_1-gnu-mvapich2-hpc-devel-static. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-mvapich2-hpc-devel-static-1.13.1-5.14.noarch.rpm"
RPM_HASH = "2c64cd564400ba550eeeeb329a6dc1bc6d089aac074b64a67eae158e0ee5e93b5575d91148c216e1b213577955567cca9aa628f4ad0bdb7af6fe985862eae649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += "/bin/sh \
adios_1_13_1-gnu-mvapich2-hpc-devel-static"

inherit rpm
