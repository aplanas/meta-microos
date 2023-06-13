SUMMARY = "Development files for hdf5-openmpi3"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the openmpi3 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi3-devel-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "ca59df38b4d8538bffa7299606d5d84d225cea549534ee83d8dca203355a2bab0e58eb9e464dc094b15ce969f42c765a3c1e7ac27a73e6bbe3767fbf81fbc1a1"

RPROVIDES:${PN} += "hdf5-openmpi3-devel \
hdf5-openmpi3-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
hdf5-devel-data \
hdf5-openmpi3 \
libhdf5-200-openmpi3 \
libhdf5_cpp200-openmpi3 \
libhdf5_fortran200-openmpi3 \
libhdf5_hl200-openmpi3 \
libhdf5_hl_cpp200-openmpi3 \
libhdf5hl_fortran200-openmpi3 \
zlib-devel"

inherit rpm
