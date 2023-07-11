SUMMARY = "Development libraries for ScaLAPACK (openmpi1)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi1-devel-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "e32eb163613f5769638955f14f1b1ba5e87093d40d91abe2cba17598b08a91c1ca512d9b066ce63b338e46111ec5bee082c779c44ae92b1786fb3e4dd67a1609"

RPROVIDES:${PN} += "libscalapack.so.2.1.0 \
libscalapack2-openmpi-devel \
libscalapack2-openmpi1-devel \
scalapack-openmpi1-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.12 \
libscalapack2-openmpi1 \
openmpi1-devel"

inherit rpm
