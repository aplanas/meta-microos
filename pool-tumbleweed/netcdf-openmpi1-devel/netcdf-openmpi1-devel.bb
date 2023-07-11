SUMMARY = "Development files for netcdf-openmpi1"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi1 version of all files needed to create projects that use NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi1-devel-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "0ce7fc3a680322e62108175a2518b8086ce2317236b58ac4dce65dd91e2fce5407d481f05454480df2253d36a57a4f33702e1f3c9e926951512e2d838a086d71"

RPROVIDES:${PN} += "netcdf-openmpi1-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hdf5-openmpi1-devel \
libcurl-devel \
libnetcdf19-openmpi1 \
netcdf-devel-data \
openmpi1-devel \
pkgconfig \
zlib-devel"

inherit rpm
