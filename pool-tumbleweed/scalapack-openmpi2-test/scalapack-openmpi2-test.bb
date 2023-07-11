SUMMARY = "Test programs for ScaLAPACK (openmpi2)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack-openmpi2-test-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "c19509462717577c392fdf827e9bddf045810cee46029a403ffebbfbc9808925cc986a7e26bf2c729b8f8f3906303b39e5278cc1921148fc3db35b0cd3f9cdb6"

RPROVIDES:${PN} += "scalapack-openmpi2-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.20 \
libmpi.so.20"

inherit rpm
