SUMMARY = "Test programs for ScaLAPACK (openmpi4)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi4-hpc-test-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "a58bc6b3cc2b075dfafa2ba7134d8a0c859261dd41641a8ae203df79121b896f121993862806a92dd0d699534d80c0d8863034958054c8653d6227e8316450ec"

RPROVIDES:${PN} += "scalapack_2_1_0-gnu-openmpi4-hpc-test \
scalapack_2_1_0-gnu-openmpi4-hpc-test(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
