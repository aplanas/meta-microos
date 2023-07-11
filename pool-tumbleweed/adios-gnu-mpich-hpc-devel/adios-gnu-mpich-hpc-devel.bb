SUMMARY = "Dependency package for adios_1_13_1-gnu-mpich-hpc-devel"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-mpich-hpc-devel provides the dependency to get binary package adios_1_13_1-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-mpich-hpc-devel-1.13.1-5.15.noarch.rpm"
RPM_HASH = "f3050370e47ebab888b509fc6170a5e91b7f3b33e2793c9cc8904bc954976f6c11822cda5ff5c86c5dc3c4326ea42985a89b17dd0ed8a5a7a12d7711d6d1ebfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-mpich-hpc-devel"

inherit rpm
