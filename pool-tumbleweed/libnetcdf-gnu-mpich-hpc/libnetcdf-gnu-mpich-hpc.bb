SUMMARY = "Dependency package for libnetcdf_4_9_2-gnu-mpich-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-gnu-mpich-hpc provides the dependency to get binary package libnetcdf_4_9_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf-gnu-mpich-hpc-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "a575cdf7394b9f8d0e094a0b6d6570e1b922df6a94baa2f4f129ac73e98983035667b3bb460aa2b8579ccc07ef724a420184a6accc3bf7c06ab3acf631ae8a98"

RPROVIDES:${PN} += "libnetcdf-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-4-9-2-gnu-mpich-hpc"

inherit rpm
