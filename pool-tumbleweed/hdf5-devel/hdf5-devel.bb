SUMMARY = "Development files for hdf5"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the serial version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-devel-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "3f10a37f35f9bde10f14718252226e4b528dfab15f0ac67013e037f3d9ab41975df68634cd95006485f2c29407ae39d8a913c7f4d4873566abb648b6295b2337"

RPROVIDES:${PN} += "hdf5-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
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
