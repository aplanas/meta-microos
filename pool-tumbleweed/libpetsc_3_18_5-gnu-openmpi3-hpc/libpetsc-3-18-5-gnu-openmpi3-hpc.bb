SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc_3_18_5-gnu-openmpi3-hpc-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "44d897eff89624a52301c2c93601d6682aef42fff446807dc2012188921a4319759ba64b92c3bbd394dbebbb0b4261d77bd217abf624848477d491d4ce6e9bd0"

RPROVIDES:${PN} += "libpetsc-3-18-5-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenmpi3-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
