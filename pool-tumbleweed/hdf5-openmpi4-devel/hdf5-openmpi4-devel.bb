SUMMARY = "Development files for hdf5-openmpi4"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the openmpi4 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi4-devel-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "8488465da3d27abed3ae9525a678cbc10d30f462820be6e9fbf52d4b0a13f135fdb918b4ac5cf2308cfa86a3b7d34a05f4b0a03549f1690a543d07f150617cf7"

RPROVIDES:${PN} += "hdf5-openmpi4-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hdf5-devel-data \
hdf5-openmpi4 \
libhdf5-200-openmpi4 \
libhdf5-cpp200-openmpi4 \
libhdf5-fortran200-openmpi4 \
libhdf5-hl-cpp200-openmpi4 \
libhdf5-hl200-openmpi4 \
libhdf5hl-fortran200-openmpi4 \
zlib-devel"

inherit rpm
