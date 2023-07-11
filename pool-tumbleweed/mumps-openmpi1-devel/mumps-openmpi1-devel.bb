SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-openmpi1."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi1-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "3720104019610d00bff4c805ceefeacf03ea8d74d0923205ef071ffbfe1db9f7bc331e8bc5130b3b3dae2bf61895f1f6aa9da05b483264b4285fc0b639b1a59f"

RPROVIDES:${PN} += "mumps-openmpi1-devel"

RDEPENDS:${PN} += "libmumps5-3-5-openmpi1 \
mumps-devel \
openmpi1-devel \
scalapack-openmpi1-devel"

inherit rpm
