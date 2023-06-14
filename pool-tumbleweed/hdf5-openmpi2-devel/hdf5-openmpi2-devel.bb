SUMMARY = "Development files for hdf5-openmpi2"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the openmpi2 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi2-devel-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "7244554b70059f65fd5b3deaf17ceaf3f8895ef29833e3e7a14a3f0471c8852ceef984d0596acb5e88f4fca201f07b3c18298c8046c682ee6f8217c736705c6f"

RPROVIDES:${PN} += "hdf5-openmpi2-devel"

RDEPENDS:${PN} += "/bin/sh \
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
