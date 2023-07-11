SUMMARY = "Test programs for ScaLAPACK (openmpi4)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack-openmpi4-test-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "e80e1cbbb1b4cba8c9c8ea0ef20d99495d33a333ff54065a3c3dc4d273afb2df41ab3757902cddbf6e1b61f8219002adf8d01ecd48a1106eebf4bcbac47ba5d1"

RPROVIDES:${PN} += "scalapack-openmpi4-test"

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
