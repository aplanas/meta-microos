SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of utility functions for working with NetCDF files \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi4-hpc-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "318b72f80c747a4a25337c9620540b40fef1786810cef59cd051be80863e24bf651bac071722d5b7d7739e94ec4aea0dc700caffbe5fc060c8f81ced04beb36d"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf-4-9-2-gnu-openmpi4-hpc"

inherit rpm
