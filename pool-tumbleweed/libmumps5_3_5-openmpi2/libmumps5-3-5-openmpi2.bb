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

RPM_NAME = "libmumps5_3_5-openmpi2-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "327e1ee3bd8a1686c5f345adec57564a01c613953c8a45291e51d8b4d31206e68870f59f83e1c19e3c72d67834cd271d0f503c792cb3ccc8ba292b3e9c08ec5f"

RPROVIDES:${PN} += "libcmumps.so.5.3.5 \
libdmumps.so.5.3.5 \
libmumps-common$.so.5.3.5 \
libmumps5-3-5-openmpi2 \
libpord.so.5.3.5 \
libsmumps.so.5.3.5 \
libzmumps.so.5.3.5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblacs.so.2.1.0 \
libblacs2-openmpi2 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.20 \
libmpi-usempi-ignore-tkr.so.20 \
libmpi-usempif08.so.20 \
libmpi.so.20 \
libscalapack.so.2.1.0"

inherit rpm
