SUMMARY = "Static development files for netcdf_4_9_2-gnu-openmpi4-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of the static libraries for NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi4-hpc-devel-static-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "ea17a5ba1be7e863f4fe1aac82eb888044d3f23b76f4ad5c1ed5098350541c7abfd6dc636a4f9e7066f920574c1040414d9afdf364606869f62e2d0d2244b29d"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi4-hpc-devel-static"

RDEPENDS:${PN} += "libcurl-devel \
netcdf-4-9-2-gnu-openmpi4-hpc-devel \
zlib-devel"

inherit rpm
