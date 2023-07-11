SUMMARY = "Development libraries for ScaLAPACK (mpich)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against mpich."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-mpich-hpc-devel-2.1.0-9.21.aarch64.rpm"
RPM_HASH = "cdb7e8adf04b2fd1b1246751137a63ba193cd40d001e1c0992b367790aca2893895f714dd0a2e9db4484e0754a5cde058ce7ae01f7d864277b9d31bd55679a8d"

RPROVIDES:${PN} += "libblacs2-2-1-0-gnu-mpich-hpc-devel \
libscalapack2-2-1-0-gnu-mpich-hpc-devel \
scalapack-2-1-0-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libscalapack2-2-1-0-gnu-mpich-hpc \
mpich-gnu-hpc-devel"

inherit rpm
