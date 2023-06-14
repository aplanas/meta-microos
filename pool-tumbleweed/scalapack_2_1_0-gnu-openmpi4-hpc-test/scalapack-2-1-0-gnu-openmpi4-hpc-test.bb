SUMMARY = "Test programs for ScaLAPACK (openmpi4)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi4-hpc-test-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "a58bc6b3cc2b075dfafa2ba7134d8a0c859261dd41641a8ae203df79121b896f121993862806a92dd0d699534d80c0d8863034958054c8653d6227e8316450ec"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-openmpi4-hpc-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
