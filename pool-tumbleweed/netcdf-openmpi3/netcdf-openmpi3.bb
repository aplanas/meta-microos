SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi3 version of utility functions for working with NetCDF files."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi3-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "5d5f92af6f0e9fd69c8d0e494463b9066e41d2a7dd7ac7d0f7401b2cd18105843982cc500ff98245e9b93f3c6ee30b5af311777d0256b1e7f573e6a173fb99eb"

RPROVIDES:${PN} += "netcdf-openmpi3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200 \
libnetcdf.so.19 \
libnetcdf19-openmpi3"

inherit rpm
