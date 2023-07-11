SUMMARY = "Static development files for netcdf_c++"
DESCRIPTION = "Libraries to build statically linked applications with NetCDF."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf-cxx4_4_3_1-gnu-hpc-devel-static-4.3.1-6.6.aarch64.rpm"
RPM_HASH = "070c1a003fa2abba33ac7f7e396ba58577bd95e9f65fbc96a259a117ce4f6da93cc4e8c96939bd8ba159b714df44c6667a62a67c088a368e489b70e5a928ed4d"

RPROVIDES:${PN} += "libnetcdf-cxx4-4-3-1-gnu-hpc-devel-static"

RDEPENDS:${PN} += "libnetcdf-cxx4-4-3-1-gnu-hpc-devel"

inherit rpm
