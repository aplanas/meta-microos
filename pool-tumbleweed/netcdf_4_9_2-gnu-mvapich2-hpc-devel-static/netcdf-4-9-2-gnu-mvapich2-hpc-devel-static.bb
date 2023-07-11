SUMMARY = "Static development files for netcdf_4_9_2-gnu-mvapich2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the mvapich2 version of the static libraries for NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-mvapich2-hpc-devel-static-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "96351fa9d36609a2717d6bf0036c53fb2bbf5b4cc31a1029a0a7a64925f3bc556130b1cb6faa4f2f33c538fd517309cc136a60e614e51a06955b8a984e397ea1"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += "libcurl-devel \
netcdf-4-9-2-gnu-mvapich2-hpc-devel \
zlib-devel"

inherit rpm
