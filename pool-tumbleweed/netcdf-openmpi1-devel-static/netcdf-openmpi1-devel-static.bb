SUMMARY = "Static development files for netcdf-openmpi1"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi1 version of the static libraries for NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi1-devel-static-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "52e10b725f5eddefee7f5ca7f9c8d70ef8b3cc2b1a91424be7e811fd2a0108cdd61475730891d6b1c321771e2b1891da86649a02bada021bbb63a7e99619881b"

RPROVIDES:${PN} += "netcdf-openmpi1-devel-static \
netcdf-openmpi1-devel-static(aarch-64)"
RDEPENDS:${PN} += "hdf5-openmpi1-devel \
libcurl-devel \
zlib-devel"

inherit rpm
