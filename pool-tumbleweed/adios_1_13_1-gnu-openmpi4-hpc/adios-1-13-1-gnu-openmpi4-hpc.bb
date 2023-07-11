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

RPM_NAME = "adios_1_13_1-gnu-openmpi4-hpc-1.13.1-5.15.aarch64.rpm"
RPM_HASH = "2f596eb3fef16d86f2923e31060e4d6664c582502eebab7f66514ebc0662dd340f458b9fd8f5e0b5f8eb64c3de217d09476a22e812362d25fa777b66e53194da"

RPROVIDES:${PN} += "adios-1-13-1-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
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
