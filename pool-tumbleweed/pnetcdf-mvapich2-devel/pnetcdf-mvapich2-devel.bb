SUMMARY = "Development files for pnetcdf-mvapich2"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the mvapich2 version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-mvapich2-devel-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "6766e4d604568b4ff84c75d8984cccc67883a3830740e1ebd27689699045f76c041df4202d8272b01482e02f33c62d2a9b9f02290d566bd0bb8472c87ddbe8ae"

RPROVIDES:${PN} += "parallel-netcdf-mvapich2-devel \
pkgconfig(pnetcdf) \
pnetcdf-mvapich2-devel \
pnetcdf-mvapich2-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-mvapich2 \
mvapich2-devel \
pnetcdf-devel-data"

inherit rpm
