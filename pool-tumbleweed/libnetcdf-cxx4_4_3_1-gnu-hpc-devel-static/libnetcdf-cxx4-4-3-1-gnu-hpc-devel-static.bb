SUMMARY = "Static development files for netcdf_c++"
DESCRIPTION = "Libraries to build statically linked applications with NetCDF."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf-cxx4_4_3_1-gnu-hpc-devel-static-4.3.1-6.5.aarch64.rpm"
RPM_HASH = "d4431baaa28475e71f2c9717ec04ac292b7374f0cf2b8ad06e16746691b7b3157fb3553be12e372d0b1cc49133b113ca3be7c1989a829d9c958c3f2a3358ab6c"

RPROVIDES:${PN} += "libnetcdf-cxx4_4_3_1-gnu-hpc-devel-static \
libnetcdf-cxx4_4_3_1-gnu-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "libnetcdf-cxx4_4_3_1-gnu-hpc-devel"

inherit rpm
