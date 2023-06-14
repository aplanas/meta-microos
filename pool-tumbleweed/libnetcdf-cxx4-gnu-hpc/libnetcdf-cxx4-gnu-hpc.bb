SUMMARY = "Dependency package for libnetcdf-cxx4_4_3_1-gnu-hpc"
DESCRIPTION = "netcdf-cxx4: C++ library for the Unidata network Common Data Form version 4 \
The package libnetcdf-cxx4-gnu-hpc provides the dependency to get binary package libnetcdf-cxx4_4_3_1-gnu-hpc. \
When this package gets updated it installs the latest version of netcdf-cxx4_4_3_1-gnu-hpc."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf-cxx4-gnu-hpc-4.3.1-6.5.aarch64.rpm"
RPM_HASH = "eb86ebbf52fc8ebae03031a0dd21901b7fe543482f73ad1b33256fe099fc529d98169f2bd780e37c4ec62c27ead6a0a4092f198cad4d215b88cc3e0bf78b2c1a"

RPROVIDES:${PN} += "libnetcdf-cxx4-gnu-hpc"

RDEPENDS:${PN} += "/bin/sh \
libnetcdf-cxx4-4-3-1-gnu-hpc"

inherit rpm
