SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "da2781e64d589e3f3001df69733f9db32730bc2dcb5ef0b1b42e31087e225a2f12403d4b342d25d4a09b3aa2e9cb60d94b0f37f3bcdf3d4785b5f3e6c0feb7b2"

RPROVIDES:${PN} += "mumps-devel \
mumps-devel(aarch-64)"
RDEPENDS:${PN} += "blas-devel \
lapack-devel \
libmumps5_3_5"

inherit rpm
