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
This package contains the openmpi3 version of the NetCDF runtime libraries."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf19-openmpi3-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "2f2d0da77a690c26b61d9f007cc5f32a8be7968b494bb3cc04d9cae771e74bfcfb698ffe49b3495c735b96458429f1cd8c3d5e3f8df41c4769d9fd975dcc62c5"

RPROVIDES:${PN} += "libnetcdf.so.19 \
libnetcdf19-openmpi3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libm.so.6 \
libmpi.so.40 \
libxml2.so.2"

inherit rpm
