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

RPM_NAME = "adios_1_13_1-gnu-openmpi2-hpc-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "6dd3c0db76b23d7f7dc3b07d2daea2e9792ca88cab2bc0b8e97b2a04c578e9ec73b5682b7bc0ec5f578253e6cc9050dcc1409bac0c9b743dd4d67ea9d4cce0b2"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblz4.so.1 \
libm.so.6 \
libopenmpi2-gnu-hpc \
libz.so.1 \
lua-lmod \
python3-PyYAML \
python3-xml"

inherit rpm
