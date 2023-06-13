SUMMARY = "PETsc SAWs infrastructure"
DESCRIPTION = "This package contains the files to interface with SAWs \
(Scientific Application Web server). SAWs itself is not \
yet supported by openSUSE."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-mpich-hpc-saws-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "7267a253e0f20663649783ae076e1d7883765be56416c902c00329f66cbba2a1fcbb1783d89455affe39fe1d89d67ce1372a36efc489d641c7829e68182fcc9d"

RPROVIDES:${PN} += "petsc_3_18_5-gnu-mpich-hpc-saws \
petsc_3_18_5-gnu-mpich-hpc-saws(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
libpetsc_3_18_5-gnu-mpich-hpc"

inherit rpm
