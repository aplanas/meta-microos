SUMMARY = "Development files for netcdf_c++"
DESCRIPTION = "This package contains the netcdf_c++4 header files and shared devel libs."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf-cxx4_4_3_1-gnu-hpc-devel-4.3.1-6.5.aarch64.rpm"
RPM_HASH = "03782e2a970ce7521e9e4980c124ba8ae68cb0761fad61933c08da07db55b6ddfd0d371cfa98a31a2abf83a2667251871bdf10f7756e054848a152a10da8cbf2"

RPROVIDES:${PN} += "libnetcdf-cxx4-4-3-1-gnu-hpc-devel \
netcdf-cxx4-4-3-1-gnu-hpc-tools"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnetcdf-cxx4-4-3-1-gnu-hpc \
libstdc++.so.6 \
netcdf-gnu-hpc-devel"

inherit rpm
