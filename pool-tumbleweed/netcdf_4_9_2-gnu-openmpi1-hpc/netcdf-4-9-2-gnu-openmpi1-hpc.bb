SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi1 version of utility functions for working with NetCDF files \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi1-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "7d2c983f4218afab3777dc64cfc1e02e5c30f23feac65aec8f43caec747a6b85291dc02c0e8919b9b04ecb24e3b7b4b2491ce33eb251446cf7dd17bedcffc0be"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf-4-9-2-gnu-openmpi1-hpc"

inherit rpm
