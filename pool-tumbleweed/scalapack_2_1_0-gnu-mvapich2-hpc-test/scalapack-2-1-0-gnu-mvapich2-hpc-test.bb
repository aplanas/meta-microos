SUMMARY = "Test programs for ScaLAPACK (mvapich2)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-mvapich2-hpc-test-2.1.0-9.21.aarch64.rpm"
RPM_HASH = "987ca9b3903940c71d405647da39561605749911776a064763f23959b196d13d585fdd4fbf7df636d2f216c315cfc155dcc69bf09760289c2a173911971fbccc"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-mvapich2-hpc-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
