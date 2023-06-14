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
This package contains the openmpi2 version of the NetCDF runtime libraries \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf_4_9_2-gnu-openmpi2-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "ccdac8912e8a72f33c74f8620f81e8c7500f31217c993f167b0f3f7744f9d8093f4946a0d162a4593fd128df00bbe04ddc83ded98c5513ab4863c8e64db5c54d"

RPROVIDES:${PN} += "libnetcdf-4-9-2-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libhdf5-gnu-openmpi2-hpc \
libhdf5-hl-gnu-openmpi2-hpc \
libm.so.6 \
libopenmpi2-gnu-hpc \
libxml2.so.2 \
lua-lmod"

inherit rpm
