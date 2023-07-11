SUMMARY = "Development files for netcdf_c++"
DESCRIPTION = "This package contains the netcdf_c++ header files and shared devel libs. \
It's not recommended for new projects, but it still works."
LICENSE = "NetCDF"

PV = "4.2"

RPM_NAME = "libnetcdf_c++-devel-4.2-8.32.aarch64.rpm"
RPM_HASH = "c075318a3428cb9be924bba10d13cff2a6ccf4fc9ce798f0955235944de6b217ecda99c6727846c731fbf9a92caae9cbf03366966cc647a3d5892cccba68dd7f"

RPROVIDES:${PN} += "libnetcdf-c++-devel \
libnetcdf-devel-/usr/lib64/libnetcdf-c++.so"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-c++4"

inherit rpm
