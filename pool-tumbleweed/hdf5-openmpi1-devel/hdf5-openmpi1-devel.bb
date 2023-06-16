SUMMARY = "Development files for hdf5-openmpi1"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the openmpi1 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi1-devel-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "60775f14a58716df3c68adfd1f4456e259ad75e8f250a3cea4029a57c5a84d69dd5c9edd7941dac4a3d774666fb9f2e8c84f0b18b63479492e33282fab73be92"

RPROVIDES:${PN} += "hdf5-openmpi1-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hdf5-devel-data \
hdf5-openmpi1 \
libhdf5-200-openmpi1 \
libhdf5-cpp200-openmpi1 \
libhdf5-fortran200-openmpi1 \
libhdf5-hl-cpp200-openmpi1 \
libhdf5-hl200-openmpi1 \
libhdf5hl-fortran200-openmpi1 \
zlib-devel"

inherit rpm
