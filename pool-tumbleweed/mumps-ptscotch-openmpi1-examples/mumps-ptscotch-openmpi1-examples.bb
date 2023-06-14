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

RPM_NAME = "mumps-ptscotch-openmpi1-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "5f118739797e92953861709bb8db84d2fa476f8bfe64277e5b02e9ae6d3f8884b12bf78761a076775b984d2060d2f85f7c377fd2ef4758a47d6327a096d6ace0"

RPROVIDES:${PN} += "mumps-examples)(openmpi \
mumps-ptscotch-openmpi1-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblacs.so.2.1.0 \
libblas.so.3 \
libc.so.6 \
libcmumps-ptscotch.so.5.3.5 \
libdmumps-ptscotch.so.5.3.5 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.12 \
libmpi-usempi-ignore-tkr.so.6 \
libmpi-usempif08.so.11 \
libmpi.so.12 \
libmumps-common.so.5.3.5 \
libmumps-ptscotch5-3-5-openmpi1 \
libpord-ptscotch.so.5.3.5 \
libptesmumps.so.0 \
libptscotch.so.0 \
libptscotcherr.so.0 \
libscalapack.so.2.1.0 \
libscotch.so.0 \
libsmumps-ptscotch.so.5.3.5 \
libzmumps-ptscotch.so.5.3.5"

inherit rpm
