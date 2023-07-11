SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the mpich version of utility functions for working with NetCDF files \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-mpich-hpc-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "4988ef16c7eddc022a68507e19eaa3e603eb0017dd453a9d2203109da4dc9d193d5ab48456ba3e96b85be5753a0d85014e02055311f8e8fdf55c9d388d404970"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-mpich-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf-4-9-2-gnu-mpich-hpc"

inherit rpm
