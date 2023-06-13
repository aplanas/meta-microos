SUMMARY = "Test programs for ScaLAPACK (mpich)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
mpich."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-mpich-hpc-test-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "804737572dad65ebf3d40187bcf3fc2c794f5a93d3db7ceb877a699f069b0c2a750e827a307d1ca7317508e2758f4f4cfbc210029746034e15e2fbb78f03c52c"

RPROVIDES:${PN} += "scalapack_2_1_0-gnu-mpich-hpc-test \
scalapack_2_1_0-gnu-mpich-hpc-test(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit)"

inherit rpm
