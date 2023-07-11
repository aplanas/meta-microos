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

RPM_NAME = "mumps_5_3_5-gnu-openmpi1-hpc-examples-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "193ebc065ac5a87cfc7a2802a04b382fd38ba44a4fbfcd1618beab29d9544e3d3604c44b2574319eeafcb1dbe6725663af8e9fdfe4064b02164b15419430b431"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi1-hpc-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-openmpi1-hpc"

inherit rpm
