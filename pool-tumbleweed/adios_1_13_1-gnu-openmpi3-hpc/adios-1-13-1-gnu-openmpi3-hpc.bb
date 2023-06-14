SUMMARY = "The Adaptable IO System (ADIOS)"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. By providing an external \
to the code XML file describing the various elements, their types, \
and how one wishes to process them for a particular run, the routines \
in the host code (either FORTRAN or C) can transparently change how \
they process the data."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-openmpi3-hpc-1.13.1-5.13.aarch64.rpm"
RPM_HASH = "a266b582dc2167a606e47d206f0e7a24069760836d2d15e19c053ce93931d3c8beed8061c2f1520973b33022e8663f2ca7c9319ff1ca717e543f00a5ee143a34"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblz4.so.1 \
libm.so.6 \
libopenmpi3-gnu-hpc \
libz.so.1 \
lua-lmod \
python3-PyYAML \
python3-xml"

inherit rpm
