SUMMARY = "Static development files for netcdf_4_9_2-gnu-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the static libraries for NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-hpc-devel-static-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "6d0796bc9772f60d8cde4c28dd96a146f5b6bf73d837a70033e5b9c9aa68e3ea2f3ba6c0dfde09d06d8600936d75d83ff25982baf6ccea9c2c18fa2dfb6d6a2a"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-hpc-devel-static"

RDEPENDS:${PN} += "libcurl-devel \
netcdf-4-9-2-gnu-hpc-devel \
zlib-devel"

inherit rpm
