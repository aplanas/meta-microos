SUMMARY = "Static development files for netcdf"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the static libraries for NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-devel-static-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "b71e1cf16e20f25f65a1b9da52abbaa1aacf9f4c06edacb40edc97798fdbf8a51d3c35f0c4e1499dc910d82a46cad44a0f86c8ae52c45108167cda6cc99e363b"

RPROVIDES:${PN} += "netcdf-devel-static"

RDEPENDS:${PN} += "hdf5-devel \
libcurl-devel \
zlib-devel"

inherit rpm
