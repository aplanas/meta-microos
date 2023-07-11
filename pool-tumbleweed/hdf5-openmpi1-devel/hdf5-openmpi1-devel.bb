SUMMARY = "Development files for hdf5-openmpi1"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the openmpi1 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi1-devel-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "9ca73ba6f3b2a7e31db9e7acd19071869620d80928c9cd5954eb4c390da7d9c8d2246e819b6a95edb8b623292cb0596d388f83500c5f8c9f2aa3fec31495dcb5"

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
