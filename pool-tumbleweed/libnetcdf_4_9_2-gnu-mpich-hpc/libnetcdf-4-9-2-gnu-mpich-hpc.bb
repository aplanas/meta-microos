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
This package contains the mpich version of the NetCDF runtime libraries \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf_4_9_2-gnu-mpich-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "7ba7026b69e24d611cbe54863f239d7375b48af644eff1f0662236e8a8027da6ed3d8ac7097b4ae6a6e965e6036f8b1c61029da58ba0b05741e8a9af7924da8f"

RPROVIDES:${PN} += "libnetcdf-4-9-2-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libhdf5-gnu-mpich-hpc \
libhdf5-hl-gnu-mpich-hpc \
libm.so.6 \
libxml2.so.2 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
