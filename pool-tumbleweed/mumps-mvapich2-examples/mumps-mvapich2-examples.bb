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

RPM_NAME = "mumps-mvapich2-examples-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "d96a3139585ffa9ef13ab3477ebe81f2eb13bd6e36f6c9fa5b1dab379e83a1f46d950a69e2945e2dbbd1b8d5133f54611570c5c0dade443a392fe44f9f739b97"

RPROVIDES:${PN} += "mumps-examples)(mvapich2 \
mumps-mvapich2-examples"

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
libmpi.so.12 \
libmpifort.so.12 \
libmumps-common$.so.5.3.5 \
libmumps5-3-5-mvapich2 \
libpord.so.5.3.5 \
libscalapack.so.2.1.0 \
libsmumps.so.5.3.5 \
libzmumps.so.5.3.5"

inherit rpm
