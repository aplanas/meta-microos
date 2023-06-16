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

RPM_NAME = "adios_1_13_1-gnu-mvapich2-hpc-1.13.1-5.14.aarch64.rpm"
RPM_HASH = "987f162dfcd91902bd269959821a2622ddc7cc6eef98dfbc3b8d162de9afca5ff22962fc5ad80fd4f8a44326b97dd98b0fac68a6bf590ff48c591eb52f44609a"

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
