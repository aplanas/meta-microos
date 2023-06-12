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

RPM_NAME = "adios-openmpi3-1.13.1-5.12.aarch64.rpm"
RPM_HASH = "5d6b88f3106dff7739f1770b4900e00879817021401583d8dc95e350c5e1e13edf8049e4938dfa2fc511691bf23a6763bbf55712b933b89aad0cb648757ff5d7"

RPROVIDES:${PN} += "adios-openmpi3 \
adios-openmpi3(aarch-64) \
config(adios-openmpi3)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_hl.so.200()(64bit) \
liblz4.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi.so.40()(64bit) \
libnetcdf.so.19()(64bit) \
libz.so.1()(64bit) \
python3-PyYAML \
python3-xml"

inherit rpm