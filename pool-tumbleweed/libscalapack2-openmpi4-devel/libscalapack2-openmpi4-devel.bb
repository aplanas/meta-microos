SUMMARY = "Development libraries for ScaLAPACK (openmpi4)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi4-devel-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "997f4e1919d869e6b77d3e07689f99852b5ee8e3971c103c92cf5960e10b66e28de878454c8a81fc96b6f98ed901bbd3ddea6427ed57ff256f10ec2577af35ef"

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
