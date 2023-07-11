SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "62e2672a4e8078454d573b987b6ed30bde103d453d2eea8e6b8efd7ac5a60f0b25c6440d1072c6bbc1aaac478d951dcf8bfc69aa9e4b5c08146c076affb4f190"

RPROVIDES:${PN} += "mumps-devel"

RDEPENDS:${PN} += "blas-devel \
lapack-devel \
libmumps5-3-5"

inherit rpm
