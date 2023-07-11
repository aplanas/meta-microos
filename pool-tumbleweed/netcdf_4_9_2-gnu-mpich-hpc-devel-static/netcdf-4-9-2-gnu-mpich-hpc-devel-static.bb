SUMMARY = "Static development files for netcdf_4_9_2-gnu-mpich-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the mpich version of the static libraries for NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-mpich-hpc-devel-static-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "6b60dc8ac081033d5d57fa3f9d5d31f657e7565dcafa1f68fefbaa6dea3968f348ddb167dc7d4d788fae0f0b8c272822d0576e01d7cb005cf06a9d6dfa19e703"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-mpich-hpc-devel-static"

RDEPENDS:${PN} += "libcurl-devel \
netcdf-4-9-2-gnu-mpich-hpc-devel \
zlib-devel"

inherit rpm
