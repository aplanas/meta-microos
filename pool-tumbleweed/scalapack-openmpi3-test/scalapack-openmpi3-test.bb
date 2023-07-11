SUMMARY = "Test programs for ScaLAPACK (openmpi3)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack-openmpi3-test-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "c2fea3cd3af2bf9ad0a00e134c97d3a2de1e05c2e9cb5ba921ee3aacfa0ad5e98d25d36f4c213ef84531ca7a587f6d16ecb4e92275db518aebc4d0475870f1c8"

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
