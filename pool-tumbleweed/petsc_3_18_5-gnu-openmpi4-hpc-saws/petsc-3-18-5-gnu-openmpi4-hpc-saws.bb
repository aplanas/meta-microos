SUMMARY = "PETsc SAWs infrastructure"
DESCRIPTION = "This package contains the files to interface with SAWs \
(Scientific Application Web server). SAWs itself is not \
yet supported by openSUSE."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi4-hpc-saws-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "bad1c16dd907403c818a02ee9c91475f4ab91d4af35ce67d07d222f6fd20cd6ab61801faf05ea2459c253f9a976e5e39cc5468d39adbf94eeb4a02adfd5d80e4"

RPROVIDES:${PN} += "petsc_3_18_5-gnu-openmpi4-hpc-saws \
petsc_3_18_5-gnu-openmpi4-hpc-saws(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
libpetsc_3_18_5-gnu-openmpi4-hpc"

inherit rpm
