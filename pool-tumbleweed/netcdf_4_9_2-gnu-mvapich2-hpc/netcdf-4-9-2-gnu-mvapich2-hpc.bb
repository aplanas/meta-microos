SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the mvapich2 version of utility functions for working with NetCDF files \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-mvapich2-hpc-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "72be555321dcdb5c5b4bf54d82cb763f9b66b446d74943a9fe35fc55048511be33f3c07ae372b00c470d30217b7a922f83c43d9bf3e1a2d5d8ec9ee0e3e4ec07"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf-4-9-2-gnu-mvapich2-hpc"

inherit rpm
