SUMMARY = "PETsc SAWs infrastructure"
DESCRIPTION = "This package contains the files to interface with SAWs \
(Scientific Application Web server). SAWs itself is not \
yet supported by openSUSE."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi2-hpc-saws-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "3cff81ce73439812d98316b6de2ba79477473af32a4cfeb5e02f464c92a6a0522c4fa349c814444bb7e636dce379194b189f91d388638e741024e42e309505e2"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-openmpi2-hpc-saws"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
libpetsc-3-18-5-gnu-openmpi2-hpc"

inherit rpm
