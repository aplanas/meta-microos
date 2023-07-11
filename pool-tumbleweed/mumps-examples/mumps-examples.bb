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

RPM_NAME = "mumps-examples-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "ba1f1307c410d5c08437196c5fe04f2ea4064b41e0254ac26977fee481e1d110a0bf3f4b53ff86a34e7c49a71cf57f177d2a833960a8768b7512d19d0aa43676"

RPROVIDES:${PN} += "mumps-examples \
mumps-examples)("

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libcmumps-seq.so.5.3.5 \
libdmumps-seq.so.5.3.5 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpiseq-seq.so.5.3.5 \
libmumps-common.so.5.3.5 \
libmumps5-3-5 \
libpord-seq.so.5.3.5 \
libsmumps-seq.so.5.3.5 \
libzmumps-seq.so.5.3.5"

inherit rpm
