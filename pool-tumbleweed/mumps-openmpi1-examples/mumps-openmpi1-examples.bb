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

RPM_NAME = "mumps-openmpi1-examples-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "025c0704ffe0af44a70b0d7c1b735b52508dff4682a226f0eaf2227db9a2fe79276c91cdbe02cbc34d78cc35e2708c10b0ccba7b2695f7a9a12f704d0b471aa0"

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
