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

RPM_NAME = "mumps_5_3_5-gnu-openmpi3-hpc-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "545b481b23fbb48b041a66fc352c721ea4ca4a4bc8d5c3207a206f5a9178eb5f160900fce3a2973cd4fe2034a5d3e82e45669b0999fe54f7929f42b274127ded"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi3-hpc-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-openmpi3-hpc"

inherit rpm
