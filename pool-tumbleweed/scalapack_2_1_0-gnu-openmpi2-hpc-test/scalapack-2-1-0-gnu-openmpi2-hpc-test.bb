SUMMARY = "Test programs for ScaLAPACK (openmpi2)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi2-hpc-test-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "a316861b2f8f2dbb8cb4d8f3fb3e0e15b4b0150a5e3845bd578cf232b58b1643286cadc5f42d4f2a6099fbd572f715054d04d7774d1ede9d1d3341461f245948"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-openmpi2-hpc-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
