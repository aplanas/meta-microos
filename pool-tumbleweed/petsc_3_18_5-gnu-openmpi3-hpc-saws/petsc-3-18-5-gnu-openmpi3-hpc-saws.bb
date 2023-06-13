SUMMARY = "PETsc SAWs infrastructure"
DESCRIPTION = "This package contains the files to interface with SAWs \
(Scientific Application Web server). SAWs itself is not \
yet supported by openSUSE."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi3-hpc-saws-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "d97ad36f1a6eae4cd424e65a33994eb168408191ce2873a0d444147ffd244f2dae70a8809e2faff2aca7876d34dcdfaa6416a155758fd260590ec1280755a60e"

RPROVIDES:${PN} += "petsc_3_18_5-gnu-openmpi3-hpc-saws \
petsc_3_18_5-gnu-openmpi3-hpc-saws(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
libpetsc_3_18_5-gnu-openmpi3-hpc"

inherit rpm
