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

RPM_NAME = "mumps-ptscotch-openmpi2-examples-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "854682b6860bdf6e552cb8b54d40ff4974d00a719b3be814d79ddbba7f22b661eca081cf38e5ead1cba54f574a264459440c45f8f73d755403628a44e8b28105"

RPROVIDES:${PN} += "mumps-examples)(openmpi \
mumps-ptscotch-openmpi2-examples"

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
libmpi-mpifh.so.20 \
libmpi-usempi-ignore-tkr.so.20 \
libmpi-usempif08.so.20 \
libmpi.so.20 \
libmumps-common.so.5.3.5 \
libmumps-ptscotch5-3-5-openmpi2 \
libpord-ptscotch.so.5.3.5 \
libptesmumps.so.0 \
libptscotch.so.0 \
libptscotcherr.so.0 \
libscalapack.so.2.1.0 \
libscotch.so.0 \
libsmumps-ptscotch.so.5.3.5 \
libzmumps-ptscotch.so.5.3.5"

inherit rpm
