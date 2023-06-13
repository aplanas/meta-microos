SUMMARY = "Shared libraries for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
NetCDF (network Common Data Form) is an interface for array-oriented \
data access and a collection of software libraries \
for C, Fortran, C++, and Perl that provides an implementation of the \
interface. The NetCDF library also defines a machine-independent \
format for representing scientific data. Together, the interface, \
library, and format support the creation, access, and sharing of \
scientific data. \
 \
NetCDF data is: \
   - Self-Describing: A NetCDF file includes information about the \
     data it contains. \
   - Network-transparent:  A NetCDF file is represented in a form that \
     can be accessed by computers with different ways of storing \
     integers, characters, and floating-point numbers. \
   - Direct-access:  A small subset of a large dataset may be accessed \
     efficiently, without first reading through all the preceding \
     data. \
   - Appendable:  Data can be appended to a NetCDF dataset along one \
     dimension without copying the dataset or redefining its \
     structure. The structure of a NetCDF dataset can be changed, \
     though this sometimes causes the dataset to be copied. \
   - Sharable:  One writer and multiple readers may simultaneously \
     access the same NetCDF file. \
 \
This package contains the openmpi1 version of the NetCDF runtime libraries \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf_4_9_2-gnu-openmpi1-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "84aa46667a1bc9f065eb882692f10c6fb9a8e0d7dc03a927cccf55e8ee009ef285e82bf9db4e903a973fa5e726728245b4deae9ab6b2281612d10393080a0f02"

RPROVIDES:${PN} += "libnetcdf_4_9_2-gnu-openmpi1-hpc \
libnetcdf_4_9_2-gnu-openmpi1-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libhdf5-gnu-openmpi1-hpc \
libhdf5_hl-gnu-openmpi1-hpc \
libm.so.6()(64bit) \
libopenmpi1-gnu-hpc \
libxml2.so.2()(64bit) \
lua-lmod"

inherit rpm
