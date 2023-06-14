SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the mvapich2 version of utility functions for working with NetCDF files \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-mvapich2-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "ed9e86c74cb9586f410b7ea09e7d65bea57fd2de337979aa7d95d93bc5974b6b90672f1b754408cf494cd524dcd88a2b0b3fb2fab70be2fc6b283d2f0476d9ca"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf-4-9-2-gnu-mvapich2-hpc"

inherit rpm
