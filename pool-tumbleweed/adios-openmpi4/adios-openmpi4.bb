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

RPM_NAME = "adios-openmpi4-1.13.1-5.12.aarch64.rpm"
RPM_HASH = "b97c0cb488efdca9000521624c92db70771007f0153b21e5d858fad51c6813c9ed848551d049ed7f086126f61925854ecbef4318ed495810f0878886754d9469"

RPROVIDES:${PN} += "adios-openmpi4 \
config-adios-openmpi4"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
liblz4.so.1 \
libm.so.6 \
libmpi.so.40 \
libnetcdf.so.19 \
libz.so.1 \
python3-PyYAML \
python3-xml"

inherit rpm
