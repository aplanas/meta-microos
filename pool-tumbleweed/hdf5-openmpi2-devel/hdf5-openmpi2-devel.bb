SUMMARY = "Development files for hdf5-openmpi2"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the openmpi2 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi2-devel-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "fa1bdc88722fb4f5a16d215e93a38f999609269451ffbf15a346d8e8c28aba1b885acc078e961dce6a550cd16cbb96c4deb7df7b74ba777d769f7a84ed81bda5"

RPROVIDES:${PN} += "hdf5-openmpi2-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hdf5-devel-data \
hdf5-openmpi2 \
libhdf5-200-openmpi2 \
libhdf5-cpp200-openmpi2 \
libhdf5-fortran200-openmpi2 \
libhdf5-hl-cpp200-openmpi2 \
libhdf5-hl200-openmpi2 \
libhdf5hl-fortran200-openmpi2 \
zlib-devel"

inherit rpm
