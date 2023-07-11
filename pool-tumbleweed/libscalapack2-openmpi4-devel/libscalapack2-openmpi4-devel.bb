SUMMARY = "Development libraries for ScaLAPACK (openmpi4)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi4-devel-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "67d1ad914e1210951cc423d249f8bb8400f7e80bcfc8a914652faa2c28a60795689a84f46a606cacec7e9f8057154f6dd923c47b26384f2be44878cc5f97c65d"

RPROVIDES:${PN} += "libscalapack.so.2.1.0 \
libscalapack2-openmpi4-devel \
scalapack-openmpi4-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.40 \
libscalapack2-openmpi4 \
openmpi4-devel"

inherit rpm
