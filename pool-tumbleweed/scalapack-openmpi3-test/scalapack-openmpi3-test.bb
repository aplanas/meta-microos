SUMMARY = "Test programs for ScaLAPACK (openmpi3)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack-openmpi3-test-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "11cc50fe6a2c4455f1795e8d8ded630d2a85f268d029a7918936508d0a9b3c6d511dff717a6887ac9cc6d28b6258901c4cfe6fbc17a67c74c622997c21a9dc45"

RPROVIDES:${PN} += "scalapack-openmpi3-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40 \
libmpi.so.40"

inherit rpm
