SUMMARY = "Static development files for netcdf_4_9_2-gnu-mvapich2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the mvapich2 version of the static libraries for NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-mvapich2-hpc-devel-static-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "22ffb4dfc62c33829fc14ace656308792076caab8d4616aae5a77115f61c35d430fbd1c96d275c8ceba4d637ee63ae6f7dea11c3f5048d14f852b4200f71e376"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += "libcurl-devel \
netcdf-4-9-2-gnu-mvapich2-hpc-devel \
zlib-devel"

inherit rpm
