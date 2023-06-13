SUMMARY = "Development files for netcdf-openmpi2"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi2 version of all files needed to create projects that use NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi2-devel-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "03dc1f3d9b9505e2240451cf8527dd0c723bd5c38499993e9cca7cc850332bc83b83e51122e47a2c404adcc6f8263a9150a713802f2dcd812fe8e6f9ac92f9d1"

RPROVIDES:${PN} += "netcdf-openmpi2-devel \
netcdf-openmpi2-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
hdf5-openmpi2-devel \
libcurl-devel \
libnetcdf19-openmpi2 \
netcdf-devel-data \
openmpi2-devel \
pkgconfig \
zlib-devel"

inherit rpm
