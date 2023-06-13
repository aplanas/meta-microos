SUMMARY = "Development files for pnetcdf_1_12_3-gnu-mvapich2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the mvapich2 version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-mvapich2-hpc-devel-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "27ecb34a8fe02c2140fdeffda410ae5523bf33f923433ae067df85d88e585f814d3810e091ba9eca2946e313acc9911420d2094465fa93b5d00f99964ba264f0"

RPROVIDES:${PN} += "pkgconfig(pnetcdf) \
pnetcdf_1_12_3-gnu-mvapich2-hpc-devel \
pnetcdf_1_12_3-gnu-mvapich2-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libpnetcdf_1_12_3-gnu-mvapich2-hpc \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
mvapich2-gnu-hpc-devel"

inherit rpm
