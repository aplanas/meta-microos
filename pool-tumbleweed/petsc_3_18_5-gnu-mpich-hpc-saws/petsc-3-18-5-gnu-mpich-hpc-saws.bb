SUMMARY = "PETsc SAWs infrastructure"
DESCRIPTION = "This package contains the files to interface with SAWs \
(Scientific Application Web server). SAWs itself is not \
yet supported by openSUSE."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-mpich-hpc-saws-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "ada3192333bb23a9f13dc8eb1a935d630e4d3e5f8780a7826846075cb09a18bc27c8d1f0d2674947f8b8ec28da4d66f68d6427854712d6543d5c1bb562a5b03e"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-mpich-hpc-saws"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
libpetsc-3-18-5-gnu-mpich-hpc"

inherit rpm
