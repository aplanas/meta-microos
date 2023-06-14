SUMMARY = "Dependency package for libnetcdf_4_9_2-gnu-mpich-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-gnu-mpich-hpc provides the dependency to get binary package libnetcdf_4_9_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf-gnu-mpich-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "13219da90026c60d4ed76b252e7f461b4bf8132a4a584dcdb44960742f42a76e19dfb3ef1587dcddd2abf81dd2eee8a2898011d941c4ecc213c6f8183417d823"

RPROVIDES:${PN} += "libnetcdf-gnu-mpich-hpc"

RDEPENDS:${PN} += "/bin/sh \
libnetcdf-4-9-2-gnu-mpich-hpc"

inherit rpm
