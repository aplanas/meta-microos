SUMMARY = "Test programs for ScaLAPACK (openmpi2)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi2-hpc-test-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "ef7376046eefe2a0051e0423a5cd02dd57ccb059cd4f56358ee8c250d947430131b2a5960fe6179b20dd4e92b44e12f91c9070919de56900562ffdc9e4dd58f1"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-openmpi2-hpc-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
