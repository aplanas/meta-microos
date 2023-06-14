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

RPM_NAME = "adios_1_13_1-gnu-openmpi4-hpc-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "38ad6d5add0c02b791a9267a1d5d91c2e5d534166e7e377ba87ce4d8762f509c179a4bcec3111ac7eb372601268bb40fd481eaa05c507848a3f37ee4196103f8"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblz4.so.1 \
libm.so.6 \
libopenmpi4-gnu-hpc \
libz.so.1 \
lua-lmod \
python3-PyYAML \
python3-xml"

inherit rpm
