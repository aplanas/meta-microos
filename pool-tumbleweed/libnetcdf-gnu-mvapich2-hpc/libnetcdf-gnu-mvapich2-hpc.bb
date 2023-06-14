SUMMARY = "Dependency package for libnetcdf_4_9_2-gnu-mvapich2-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-gnu-mvapich2-hpc provides the dependency to get binary package libnetcdf_4_9_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf-gnu-mvapich2-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "e1d72a095489ef74afb9f9897e3221039f66b82625ea182e8e8fee09c3b47c50c58717f4c0645b90a15c30f5d3f20105071bb6f1e9932e4a6c6a281e8cf3914b"

RPROVIDES:${PN} += "libnetcdf-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/bin/sh \
libnetcdf-4-9-2-gnu-mvapich2-hpc"

inherit rpm
