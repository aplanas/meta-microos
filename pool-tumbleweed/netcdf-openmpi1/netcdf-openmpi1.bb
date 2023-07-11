SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi1 version of utility functions for working with NetCDF files."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi1-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "40ba32254df518dd1e923ed61801c00d7e6a6fbec09f768eb3a6db70b0f2d3bd886328e0592b1a4aea6d749b7d6301b7b78bcf9fc9e63ce6038e6bb01105d0c6"

RPROVIDES:${PN} += "netcdf-openmpi1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200 \
libnetcdf.so.19 \
libnetcdf19-openmpi1"

inherit rpm
