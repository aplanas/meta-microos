SUMMARY = "Dependency package for libpnetcdf_1_12_3-gnu-mpich-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package libpnetcdf-gnu-mpich-hpc provides the dependency to get binary package libpnetcdf_1_12_3-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf-gnu-mpich-hpc-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "3a346e393390a4b6b1959691a32243d4d7aaa351148dd3716da6e47346133526f97c0767f1c8f911204e94732df541f9fe577ddd6748918b3cca90c888ef2570"

RPROVIDES:${PN} += "libpnetcdf-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpnetcdf-1-12-3-gnu-mpich-hpc"

inherit rpm
