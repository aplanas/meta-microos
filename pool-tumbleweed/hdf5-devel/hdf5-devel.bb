SUMMARY = "Development files for hdf5"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the serial version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-devel-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "864ccfa4a9338717def7e7c41cc118abd491f6adf1c2cb8e3fde9d95ef75eb08eff6fcdd91d17318324badd59c2dffa73e126e81f486a6994f3c2b01363405e4"

RPROVIDES:${PN} += "hdf5-devel"

RDEPENDS:${PN} += "/bin/sh \
hdf5 \
hdf5-devel-data \
libhdf5-200 \
libhdf5-cpp200 \
libhdf5-fortran200 \
libhdf5-hl-cpp200 \
libhdf5-hl200 \
libhdf5hl-fortran200 \
zlib-devel"

inherit rpm
