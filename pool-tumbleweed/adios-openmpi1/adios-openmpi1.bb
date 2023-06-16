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

RPM_NAME = "adios-openmpi1-1.13.1-5.12.aarch64.rpm"
RPM_HASH = "2704dcab34152e92227704ba9b18f999b1ba9cbe7b03852c0b298632feef26d8461c76a57d3570f024a992361cc2b4784017a8d050f6b973a82a79a4fbc47f9a"

RPROVIDES:${PN} += "adios-openmpi1 \
config-adios-openmpi1"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
liblz4.so.1 \
libm.so.6 \
libmpi.so.12 \
libnetcdf.so.19 \
libz.so.1 \
python3-PyYAML \
python3-xml"

inherit rpm
