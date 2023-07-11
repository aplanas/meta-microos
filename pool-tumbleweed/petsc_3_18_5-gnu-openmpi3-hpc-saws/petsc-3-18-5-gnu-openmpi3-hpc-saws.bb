SUMMARY = "PETsc SAWs infrastructure"
DESCRIPTION = "This package contains the files to interface with SAWs \
(Scientific Application Web server). SAWs itself is not \
yet supported by openSUSE."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi3-hpc-saws-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "a68ae24b1a1de4589b110410f4825ecf50a1969d82fc08b0d8b08c44245176e5d75388d87811301a925dc05cd1176f50446aa4726a300da21de6a89531966501"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-openmpi3-hpc-saws"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
libpetsc-3-18-5-gnu-openmpi3-hpc"

inherit rpm
