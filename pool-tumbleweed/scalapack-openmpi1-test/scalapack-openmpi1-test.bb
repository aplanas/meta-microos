SUMMARY = "Test programs for ScaLAPACK (openmpi1)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack-openmpi1-test-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "10da2d1717ccb763927f20cd5ce3e75531b5033be6f6c99033c863c1dc0440ec091616cfda25f1d1eace74b161a8afadf204a482ab7e351af0f6f4d78826b6fc"

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
