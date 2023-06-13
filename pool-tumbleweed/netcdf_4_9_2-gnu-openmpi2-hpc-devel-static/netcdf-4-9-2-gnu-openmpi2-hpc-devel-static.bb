SUMMARY = "Static development files for netcdf_4_9_2-gnu-openmpi2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi2 version of the static libraries for NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi2-hpc-devel-static-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "732699508bbd78ed705c39b6ecd715da66cc949012eed41c434356323eb695db77fdd9d4d769b6f0b0cbba1eaef1f8fcf4a684d7b40289b1380fe7fd8b247ca7"

RPROVIDES:${PN} += "netcdf_4_9_2-gnu-openmpi2-hpc-devel-static \
netcdf_4_9_2-gnu-openmpi2-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "libcurl-devel \
netcdf_4_9_2-gnu-openmpi2-hpc-devel \
zlib-devel"

inherit rpm
