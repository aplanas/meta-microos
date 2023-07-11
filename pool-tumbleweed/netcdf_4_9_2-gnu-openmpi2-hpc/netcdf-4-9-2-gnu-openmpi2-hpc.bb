SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi2 version of utility functions for working with NetCDF files \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi2-hpc-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "c818d57a9bf7dd6dd18f9b9cc0d26e9567db405bc1e3d2180e79b6544c8311aaacb5a8dde9751a4e7dcb44c9e206c91547fe9ab5831a7b9547879c9c361d2e84"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf-4-9-2-gnu-openmpi2-hpc"

inherit rpm
