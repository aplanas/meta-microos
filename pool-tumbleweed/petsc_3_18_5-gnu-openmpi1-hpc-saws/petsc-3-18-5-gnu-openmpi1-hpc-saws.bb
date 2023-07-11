SUMMARY = "PETsc SAWs infrastructure"
DESCRIPTION = "This package contains the files to interface with SAWs \
(Scientific Application Web server). SAWs itself is not \
yet supported by openSUSE."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi1-hpc-saws-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "2c47a1eec4322725809b4c5c0c1511d7a8378164c945d33c3ea71e354ff33309fe802b2e888bd3aee3ab92093db268b29607c0c9fe512fc6bb7f7568167c4aa4"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-openmpi1-hpc-saws"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
libpetsc-3-18-5-gnu-openmpi1-hpc"

inherit rpm
