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

RPM_NAME = "mumps_5_3_5-gnu-mvapich2-hpc-examples-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "23a9185236300ed5eaf3578de26c3c73940bc846dc66713941d2113f9aee2edcf46499788f3cfe19b92d4ad8a9d6bf556fe052ab93d06cac7ce37bd3ef25dd02"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-mvapich2-hpc-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-mvapich2-hpc"

inherit rpm
