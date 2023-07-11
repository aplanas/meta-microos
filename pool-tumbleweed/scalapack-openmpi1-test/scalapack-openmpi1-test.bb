SUMMARY = "Test programs for ScaLAPACK (openmpi1)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack-openmpi1-test-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "87562c2dc92d365ff20f989b00eabc18dc913ae56fd86dfe95ff888ffcf5edecd272bd220ed1b35f0952f76c7776b0f3c465225fbfae52a6866bdbe5311d2f08"

RPROVIDES:${PN} += "scalapack-openmpi1-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.12 \
libmpi.so.12"

inherit rpm
