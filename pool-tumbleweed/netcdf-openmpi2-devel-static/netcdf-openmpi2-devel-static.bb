SUMMARY = "Static development files for netcdf-openmpi2"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi2 version of the static libraries for NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi2-devel-static-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "13177b5268ad4eee2d5c99ce779c53469a3297fb3afb6d69f07c2fb7f9ea55aec563402fde11044d2bdc9c8391ee688e5791e3f514f8d5c50d4a98ff81f96974"

RPROVIDES:${PN} += "netcdf-openmpi2-devel-static"

RDEPENDS:${PN} += "hdf5-openmpi2-devel \
libcurl-devel \
zlib-devel"

inherit rpm
