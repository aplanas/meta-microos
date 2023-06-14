SUMMARY = "Test programs for ScaLAPACK (openmpi1)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi1-hpc-test-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "b7203d1f1d4386b2e462e8f8f41d0a737527418174eb264ac5c7e36cc76fa0f0b993ce67694bd5d0973f74ba1850c19eef443bd911b52bd8feff07e65683dc7d"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-openmpi1-hpc-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
