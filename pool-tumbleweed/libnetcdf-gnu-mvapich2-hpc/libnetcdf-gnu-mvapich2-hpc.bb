SUMMARY = "Dependency package for libnetcdf_4_9_2-gnu-mvapich2-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-gnu-mvapich2-hpc provides the dependency to get binary package libnetcdf_4_9_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf-gnu-mvapich2-hpc-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "a3a861ebede94de40fc1dd9e59d9cbf1894ea11d7ac4f27e493bd4a8f344a27a8d98b9edec6280fb3ec123eca98f6aef271ce3399b215c5a0323906aa3fd8328"

RPROVIDES:${PN} += "libnetcdf-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-4-9-2-gnu-mvapich2-hpc"

inherit rpm
