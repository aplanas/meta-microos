SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi version of the PnetCDF runtime \
libraries."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf4-openmpi4-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "eadf4658f0f73bb922d932fb26a38d5295659d11e05aa023e07c4a045ca9b96798fac141487bbed8a236bc4da9c782a3fe51c49d6b88d32420951bb022649b88"

RPROVIDES:${PN} += "libpnetcdf-openmpi4 \
libpnetcdf.so.4()(64bit) \
libpnetcdf4-openmpi4 \
libpnetcdf4-openmpi4(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libmpi.so.40()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
