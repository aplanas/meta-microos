SUMMARY = "Development libraries for ScaLAPACK (mvapich2)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-mvapich2-devel-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "a6574fedfefe0c494a920c6f6f0e878428a99fcd74077f9a1425ed9c7fca2ecb6d49203123ec2b79b2bdafc51a4c4c485fc1935fd8b7f12db312d2052fe150f7"

RPROVIDES:${PN} += "libscalapack.so.2.1.0 \
libscalapack2-mvapich2-devel \
scalapack-mvapich2-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.12 \
libscalapack2-mvapich2 \
mvapich2-devel"

inherit rpm
