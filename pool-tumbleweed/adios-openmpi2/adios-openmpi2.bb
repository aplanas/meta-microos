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

RPM_NAME = "adios-openmpi2-1.13.1-5.13.aarch64.rpm"
RPM_HASH = "dbb1b47028007a0dc5342f33595b8502d356ee54dd5f88ed75b97905cfecb1ab7c37773a406130ed60b6bccdf028b813fa25556e680acf3d1800329d9ed89b7f"

RPROVIDES:${PN} += "adios-openmpi2 \
config-adios-openmpi2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
liblz4.so.1 \
libm.so.6 \
libmpi.so.20 \
libnetcdf.so.19 \
libz.so.1 \
python3-PyYAML \
python3-xml"

inherit rpm
