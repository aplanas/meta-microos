SUMMARY = "Development files for netcdf_c++"
DESCRIPTION = "This package contains the netcdf_c++4 header files and shared devel libs."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf_c++4-devel-4.3.1-6.4.aarch64.rpm"
RPM_HASH = "881906f5663d38d0c80995e97c40532a161611bccec92f7d826018d9ff5f5bbff31ad618d3c94f20a4ec89d1aa5b57e9d09a8c5bd21c74e197b3108144645313"

RPROVIDES:${PN} += "libnetcdf-c++4-devel \
libnetcdf-devel-/usr/lib64/libnetcdf-c++.so \
netcdf-cxx4-tools \
pkgconfig-netcdf-cxx4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libnetcdf-c++4-1 \
pkgconfig-netcdf"

inherit rpm
