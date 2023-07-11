SUMMARY = "Static development files for netcdf_4_9_2-gnu-openmpi3-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi3 version of the static libraries for NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi3-hpc-devel-static-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "e368fe67cbf1ac038335a13f8df458d474bb93ade923f8fcaf51e1e5a0ecf642ff166350aed631bb0ab3ea871974fd9e9cdab6e3a6d5ceadc1c6ee342f1fa81f"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi3-hpc-devel-static"

RDEPENDS:${PN} += "libcurl-devel \
netcdf-4-9-2-gnu-openmpi3-hpc-devel \
zlib-devel"

inherit rpm
