SUMMARY = "Development data files for netcdf"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains generic files needed to create projects that use \
any version of NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-devel-data-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "b6eaa8408ddb10b674fa7a938c6405ece65dada2160eddf7318a336e476e2e85a9dfdfd0d312f2a4c7a872bafa1dd82ca6e249ea830e6f0c2f4ec86babeefb77"

RPROVIDES:${PN} += "netcdf-devel-data \
netcdf-rpm-macros \
rpm-macro--netcdf-sonum \
rpm-macro--netcdf-version"

RDEPENDS:${PN} += ""

inherit rpm
