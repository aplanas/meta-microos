SUMMARY = "Development files for netcdf_c++"
DESCRIPTION = "This package contains the netcdf_c++4 header files and shared devel libs."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf-cxx4_4_3_1-gnu-hpc-devel-4.3.1-6.6.aarch64.rpm"
RPM_HASH = "feff9ccbf5ed832d18d9080f6dda8b727a4c9b05197053fcd7caacbb7dd9d305e14f9e027ff98c75ef5921a15f3fad5ce85c805d4ca6e4264c6c7893439010dc"

RPROVIDES:${PN} += "libnetcdf-cxx4-4-3-1-gnu-hpc-devel \
netcdf-cxx4-4-3-1-gnu-hpc-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnetcdf-cxx4-4-3-1-gnu-hpc \
libstdc++.so.6 \
netcdf-gnu-hpc-devel"

inherit rpm
