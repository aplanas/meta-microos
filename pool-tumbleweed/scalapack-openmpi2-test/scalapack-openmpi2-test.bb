SUMMARY = "Test programs for ScaLAPACK (openmpi2)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack-openmpi2-test-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "217be886bea2148264048a3a54a73b1992deb1423b9e3bc3f97be85c86c0716cd02b819076c74ff4d084b3ba674489040621e372576bec1b376ce96e8ed94bdb"

RPROVIDES:${PN} += "scalapack-openmpi2-test \
scalapack-openmpi2-test(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmpi.so.20()(64bit) \
libmpi_mpifh.so.20()(64bit)"

inherit rpm
