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

RPM_NAME = "mumps-openmpi1-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "cd5ab9d3e3fda656367777f3cfea2cee5fd860e985063ea9965ff0bff9a0706274cc8c92a988ba119c886b012f9ee3581f39904e3ff78210b221135a98011025"

RPROVIDES:${PN} += "mumps-examples)(openmpi \
mumps-openmpi1-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblacs.so.2.1.0 \
libblas.so.3 \
libc.so.6 \
libcmumps.so.5.3.5 \
libdmumps.so.5.3.5 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.12 \
libmpi-usempi-ignore-tkr.so.6 \
libmpi-usempif08.so.11 \
libmpi.so.12 \
libmumps-common$.so.5.3.5 \
libmumps5-3-5-openmpi1 \
libpord.so.5.3.5 \
libscalapack.so.2.1.0 \
libsmumps.so.5.3.5 \
libzmumps.so.5.3.5"

inherit rpm
