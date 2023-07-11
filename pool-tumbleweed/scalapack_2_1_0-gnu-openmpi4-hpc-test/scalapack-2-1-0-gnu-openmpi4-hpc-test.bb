SUMMARY = "Test programs for ScaLAPACK (openmpi4)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi4-hpc-test-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "56d32c3c01b9ba7b8fc65ac34e66228e705a7284150516a5196cd93e0039a4294a13deeaf075fa7bc4e5f072bea51977a4619e388ea7cf9fdf2dd981c280f326"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-openmpi4-hpc-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
