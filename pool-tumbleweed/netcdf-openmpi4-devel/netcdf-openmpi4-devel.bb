SUMMARY = "Development files for netcdf-openmpi4"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of all files needed to create projects that use NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi4-devel-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "75f8d5de292630f4d7da798788384267592c8e612ad01f3a32ddfa1a57a1f6e8dad34df88c75a6d9eeb24513963b4fa5bdd7377941370b5023a352a8a225947a"

RPROVIDES:${PN} += "netcdf-openmpi4-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hdf5-openmpi4-devel \
libcurl-devel \
libnetcdf19-openmpi4 \
netcdf-devel-data \
openmpi4-devel \
pkgconfig \
zlib-devel"

inherit rpm
