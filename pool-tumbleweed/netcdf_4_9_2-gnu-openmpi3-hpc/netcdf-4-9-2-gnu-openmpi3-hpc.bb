SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi3 version of utility functions for working with NetCDF files \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi3-hpc-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "f6605c813ff88d693ddb6168ef4ffb4425fda4ac6bbad76178e9c0950ba4e1949e31be03fe7835a78c26c0cf651762449b5aec65a158ad54aefdaf3553b1601c"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf-4-9-2-gnu-openmpi3-hpc"

inherit rpm
