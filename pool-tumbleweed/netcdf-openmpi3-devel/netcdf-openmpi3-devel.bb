SUMMARY = "Development files for netcdf-openmpi3"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi3 version of all files needed to create projects that use NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi3-devel-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "cb4c647e411d8eacca497aabab46b44b50fe0b601c74baead2c052e2254128fed8c42c64ea38383f09494ed89d61a81a64e8cca1fb7fada6c0322dfc3efc1172"

RPROVIDES:${PN} += "netcdf-openmpi3-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hdf5-openmpi3-devel \
libcurl-devel \
libnetcdf19-openmpi3 \
netcdf-devel-data \
openmpi3-devel \
pkgconfig \
zlib-devel"

inherit rpm
