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
This package contains the openmpi1 version of the NetCDF runtime libraries."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf19-openmpi1-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "0a156753dfb2cb5de68483384332a3753c85e0b0c8a097eee8348830eb6e640f1691def7645b0b63c3f96dc007ca88a4c951af5c0df36edf73f1543beee028d6"

RPROVIDES:${PN} += "libnetcdf.so.19()(64bit) \
libnetcdf19-openmpi1 \
libnetcdf19-openmpi1(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_hl.so.200()(64bit) \
libm.so.6()(64bit) \
libmpi.so.12()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
