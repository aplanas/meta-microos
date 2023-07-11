SUMMARY = "PETsc SAWs infrastructure"
DESCRIPTION = "This package contains the files to interface with SAWs \
(Scientific Application Web server). SAWs itself is not \
yet supported by openSUSE."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-mvapich2-hpc-saws-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "ad6f0f81297c22c21c355e2380417702cd00e83209fc5abb29939fbd58577fe1db438d06a2f12a5e234a08bac589a778c381bb802920e377b196652b7bfffec4"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-mvapich2-hpc-saws"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
libpetsc-3-18-5-gnu-mvapich2-hpc"

inherit rpm
