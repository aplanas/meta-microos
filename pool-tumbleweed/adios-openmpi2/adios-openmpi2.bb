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

RPM_NAME = "adios-openmpi2-1.13.1-5.12.aarch64.rpm"
RPM_HASH = "a7f96d0ad9d2214427ca2bde9eae134b8c9a83f73da3c33470003f1fdc883191d329f3eac1b5185b99cddadc5ea8638272cb171271347b5189c84bdee59d465e"

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
