SUMMARY = "Test programs and examples for mumps"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This packages contains some test and examples programs for mumps. In addition, \
matlab and scilab extensions are provided in /usr/share/doc/packages/mumps."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi3-hpc-examples-5.3.5-3.2.aarch64.rpm"
RPM_HASH = "9f75657cad4e0c3366e91293fcd8be19fb45cb9794bce4770bd7ec6b8fbd60c496bd317bdbe6e8a0dff20e962190028fd872a3f297b66511e6c32ec4ff901bab"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi3-hpc-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-openmpi3-hpc"

inherit rpm
