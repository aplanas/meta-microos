SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "f8d0669f0c546d26e8eb602d553b5003ab1efb7c73080b8cf82e8ba43de41d9e8d87201b898060370ad44fd90597723645eb159164f81342007f6225f713c619"

RPROVIDES:${PN} += "hdf5"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-200 \
libhdf5-cpp200 \
libhdf5-fortran200 \
libhdf5-hl-cpp200 \
libhdf5-hl200 \
libhdf5.so.200 \
libhdf5hl-fortran200"

inherit rpm
