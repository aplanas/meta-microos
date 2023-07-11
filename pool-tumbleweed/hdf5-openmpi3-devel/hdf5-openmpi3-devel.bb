SUMMARY = "Development files for hdf5-openmpi3"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the openmpi3 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi3-devel-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "ba80013d90fbb3901f16d84b98b322cea2b4e347a69e74b09a79cdb1cd9198d929eb917736778980cba0874724315dc37530d8bbe53b64edd912f6f4e9dd96bf"

RPROVIDES:${PN} += "hdf5-openmpi3-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hdf5-devel-data \
hdf5-openmpi3 \
libhdf5-200-openmpi3 \
libhdf5-cpp200-openmpi3 \
libhdf5-fortran200-openmpi3 \
libhdf5-hl-cpp200-openmpi3 \
libhdf5-hl200-openmpi3 \
libhdf5hl-fortran200-openmpi3 \
zlib-devel"

inherit rpm
