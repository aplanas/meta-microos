SUMMARY = "Static development files for pnetcdf-openmpi1"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-openmpi1-devel-static-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "34195b1135d1987fa9e00f1290d058025f89f0ed7f29dcea86fc59e6ed3ddd24075ffec1502b056c15b9bd7f7f78964ff0122501dc0ca18a9d099e215b87625c"

RPROVIDES:${PN} += "parallel-netcdf-openmpi1-devel-static \
pnetcdf-openmpi1-devel-static"

RDEPENDS:${PN} += "pnetcdf-openmpi1-devel"

inherit rpm
