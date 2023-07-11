SUMMARY = "Test programs for ScaLAPACK (mpich)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
mpich."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-mpich-hpc-test-2.1.0-9.21.aarch64.rpm"
RPM_HASH = "2f191ce9635a23b15c035cfad11245cff6e982a6f9c28f2d4ba44523e351f711d066633b706bace9521b455feb842669f2dd7c72a0434c6174fd3d941d825b1b"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-mpich-hpc-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
