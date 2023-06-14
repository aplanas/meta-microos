SUMMARY = "Development files for netcdf_c++"
DESCRIPTION = "This package contains the netcdf_c++4 header files and shared devel libs."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf_c++4-devel-4.3.1-6.3.aarch64.rpm"
RPM_HASH = "857b4b3789e2f7940799c77bc33b2519eb004a33ad3abcc0a48660e14f163d34ac562faf62214487e817f81c7ea0e0a3b5b8443ece30b1f047fbd1e49296c451"

RPROVIDES:${PN} += "libnetcdf-c++4-devel \
libnetcdf-devel-/usr/lib64/libnetcdf-c++.so \
netcdf-cxx4-tools \
pkgconfig-netcdf-cxx4"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libnetcdf-c++4-1 \
pkgconfig-netcdf"

inherit rpm
