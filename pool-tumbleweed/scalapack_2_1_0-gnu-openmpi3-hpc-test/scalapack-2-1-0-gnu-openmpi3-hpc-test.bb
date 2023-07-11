SUMMARY = "Test programs for ScaLAPACK (openmpi3)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi3-hpc-test-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "c45189d43a8ad5358c1ad56cd91f7352855dbcc6d8eb187c173597e55ac6d54c80fad5012b2c093c798bbc69f7bd9057d458544cb487db6eada984bfc3e997dd"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-openmpi3-hpc-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
