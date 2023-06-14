SUMMARY = "PETsc SAWs infrastructure"
DESCRIPTION = "This package contains the files to interface with SAWs \
(Scientific Application Web server). SAWs itself is not \
yet supported by openSUSE."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi2-hpc-saws-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "53f6692838ceb94afea6184fc6ab211e533ef0e272f486907362f6abed9166ac8326f48f6e083cf6a96b7a9f77ad309f88c425ee512aae4724bc0c8b673d9be9"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-openmpi2-hpc-saws"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
libpetsc-3-18-5-gnu-openmpi2-hpc"

inherit rpm
