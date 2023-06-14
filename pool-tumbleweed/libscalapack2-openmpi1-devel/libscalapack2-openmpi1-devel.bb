SUMMARY = "Development libraries for ScaLAPACK (openmpi1)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi1-devel-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "3927fe576f45e5b79f5dee70faa3a25ed6a86295eeb01df43a740867404b83bafd11231ee3ddfb208a860f7a396b4a7daccab3a7a9f8affe45fbd2edcabd547a"

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
