SUMMARY = "Test programs for ScaLAPACK (openmpi4)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack-openmpi4-test-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "c829b73e9733a1dd1f6f320ee14fe99a9d3cffe7db476483b0adcc29aa0e254ee350bf8fa47b1b6804be88b5c19ffea0850bcb7f890daf77edcc18b1aa4d5d39"

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
