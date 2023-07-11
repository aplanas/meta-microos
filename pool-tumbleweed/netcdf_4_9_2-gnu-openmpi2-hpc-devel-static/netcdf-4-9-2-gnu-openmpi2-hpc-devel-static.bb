SUMMARY = "Static development files for netcdf_4_9_2-gnu-openmpi2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi2 version of the static libraries for NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi2-hpc-devel-static-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "1aa2568204f989f50e3e8f26a02e7b51081c00a763d63f649ef5940533183638c869f3a799b3a8d5c6511ef629ce06ba36cd76c804b2e23f8782ae6b4dc3649e"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi2-hpc-devel-static"

RDEPENDS:${PN} += "libcurl-devel \
netcdf-4-9-2-gnu-openmpi2-hpc-devel \
zlib-devel"

inherit rpm
