SUMMARY = "Test programs for ScaLAPACK (openmpi1)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi1-hpc-test-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "67936d8700b716c7663165a40ee490d61e5b411179c89638c224090d324454856d9c955e3d134e8ed8ad0fbe2bfedc039b247b0605782c42c634451b922c2e82"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-openmpi1-hpc-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
