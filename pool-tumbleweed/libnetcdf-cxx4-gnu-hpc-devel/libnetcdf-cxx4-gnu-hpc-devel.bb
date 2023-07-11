SUMMARY = "Dependency package for libnetcdf-cxx4_4_3_1-gnu-hpc-devel"
DESCRIPTION = "netcdf-cxx4: C++ library for the Unidata network Common Data Form version 4 \
The package libnetcdf-cxx4-gnu-hpc-devel provides the dependency to get binary package libnetcdf-cxx4_4_3_1-gnu-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-cxx4_4_3_1-gnu-hpc."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf-cxx4-gnu-hpc-devel-4.3.1-6.6.aarch64.rpm"
RPM_HASH = "1210453b4d2667aefbf91a0f26e162adc906359d2b2fda2b6880698c989b30605173116bf1cd06ccfd346d251499cd4dc1458e932e6fbfed208c5b0100378db2"

RPROVIDES:${PN} += "libnetcdf-cxx4-gnu-hpc-devel \
netcdf-cxx4-gnu-hpc-tools"

RDEPENDS:${PN} += "libnetcdf-cxx4-4-3-1-gnu-hpc-devel"

inherit rpm
