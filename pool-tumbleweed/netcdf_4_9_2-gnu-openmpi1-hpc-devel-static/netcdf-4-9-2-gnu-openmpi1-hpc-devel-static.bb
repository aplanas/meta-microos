SUMMARY = "Static development files for netcdf_4_9_2-gnu-openmpi1-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi1 version of the static libraries for NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi1-hpc-devel-static-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "df4e015570df1e81146177ffb9a128d4e61a0456573bac89cb39198cd30898300c35e7753624bb901f1cd541f020d914db798ad735a238a0eea10ad7c6c4c50c"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi1-hpc-devel-static"

RDEPENDS:${PN} += "libcurl-devel \
netcdf-4-9-2-gnu-openmpi1-hpc-devel \
zlib-devel"

inherit rpm
