SUMMARY = "Dependency package for libnetcdf-cxx4_4_3_1-gnu-hpc"
DESCRIPTION = "netcdf-cxx4: C++ library for the Unidata network Common Data Form version 4 \
The package libnetcdf-cxx4-gnu-hpc provides the dependency to get binary package libnetcdf-cxx4_4_3_1-gnu-hpc. \
When this package gets updated it installs the latest version of netcdf-cxx4_4_3_1-gnu-hpc."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf-cxx4-gnu-hpc-4.3.1-6.6.aarch64.rpm"
RPM_HASH = "0abdd41b0203386f7ad2ac5449f3847926688427c809a3ddbc0b246658e9a3b3dc379de54e0c3564933d8ce9d363d516c1c23cc92dc2002c29517d8ee30ab226"

RPROVIDES:${PN} += "libnetcdf-cxx4-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-cxx4-4-3-1-gnu-hpc"

inherit rpm
