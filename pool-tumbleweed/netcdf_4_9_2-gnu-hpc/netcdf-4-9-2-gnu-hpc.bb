SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains utility functions for working with NetCDF files \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "d0eac6831eccf905fc4b17f353dc41aeb4bb81014a0769e66ad5c6e9ee76cb0cca01a5caeab7d5900559c743a777020f06288372b81d57df87ba3033dd043600"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf-4-9-2-gnu-hpc"

inherit rpm
