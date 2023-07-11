SUMMARY = "Dependency package for libpnetcdf_1_12_3-gnu-openmpi4-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package libpnetcdf-gnu-openmpi4-hpc provides the dependency to get binary package libpnetcdf_1_12_3-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf-gnu-openmpi4-hpc-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "992fb18a7cac818232d9143baafac065a316a837983b6bdf588c94a6773f5f4f2198040eba15fcfca74585687496d34a797a73e96203cb6abfeb93a1393f9f5b"

RPROVIDES:${PN} += "libpnetcdf-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpnetcdf-1-12-3-gnu-openmpi4-hpc"

inherit rpm
