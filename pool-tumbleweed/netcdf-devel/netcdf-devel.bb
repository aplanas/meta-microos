SUMMARY = "Development files for netcdf"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-devel-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "182f1ba30d7680a239740fbf7bb6f59e19325c53adba826270fdfd1547949bee2de21e953ec197ca5aa549fbf4f7d0819a52a5e82f07b64ec611acdbd263b55c"

RPROVIDES:${PN} += "netcdf-devel \
pkgconfig-netcdf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
hdf5-devel \
libcurl-devel \
libnetcdf19 \
netcdf-devel-data \
pkgconfig \
zlib-devel"

inherit rpm
