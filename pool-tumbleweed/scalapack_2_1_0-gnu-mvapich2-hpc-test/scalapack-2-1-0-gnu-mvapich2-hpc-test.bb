SUMMARY = "Test programs for ScaLAPACK (mvapich2)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-mvapich2-hpc-test-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "b1323bddf5b342a28f45845fa2b86f0e7172f2b44cc1031911cc72774242a668adbd2eb3e649587b332be9a89705996b699ac8246711dabf6bacab1c0ed25ff3"

RPROVIDES:${PN} += "scalapack_2_1_0-gnu-mvapich2-hpc-test \
scalapack_2_1_0-gnu-mvapich2-hpc-test(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit)"

inherit rpm
