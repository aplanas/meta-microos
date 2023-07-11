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

RPM_NAME = "adios_1_13_1-gnu-mvapich2-hpc-1.13.1-5.15.aarch64.rpm"
RPM_HASH = "e46f1de54256e9c7665d02d11eb0481defedae981829c17554318b6e9c0d3b20596c43a58891e6c6ec18ee20275b5010ef0f34733cebd53722970f7183e258be"

RPROVIDES:${PN} += "adios-1-13-1-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblz4.so.1 \
libm.so.6 \
libz.so.1 \
lua-lmod \
mvapich2-gnu-hpc \
python3-PyYAML \
python3-xml"

inherit rpm
