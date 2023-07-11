SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps5_3_5-openmpi4-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "88f0fd2dc843a1f0d21aba8171e483a3716ebbf5a978cef5f904b60e109abbf78be05ea4597b494cf737ded6031cadb215c931bf30dc8413103a683914fa9d0a"

RPROVIDES:${PN} += "libcmumps.so.5.3.5 \
libdmumps.so.5.3.5 \
libmumps-common$.so.5.3.5 \
libmumps5-3-5-openmpi4 \
libpord.so.5.3.5 \
libsmumps.so.5.3.5 \
libzmumps.so.5.3.5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblacs.so.2.1.0 \
libblacs2-openmpi4 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40 \
libmpi-usempi-ignore-tkr.so.40 \
libmpi-usempif08.so.40 \
libmpi.so.40 \
libscalapack.so.2.1.0"

inherit rpm
