SUMMARY = "Test programs for ScaLAPACK (openmpi3)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi3-hpc-test-2.1.0-9.18.aarch64.rpm"
RPM_HASH = "1238596ce08526a70b39e31d2344b0e87c90f7dd3c216507b7ca6c13b4e5155049f3c611d2d4d623df138063d353a311e0ba8bc9ae385796518b4b9eff3a621b"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-openmpi3-hpc-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
