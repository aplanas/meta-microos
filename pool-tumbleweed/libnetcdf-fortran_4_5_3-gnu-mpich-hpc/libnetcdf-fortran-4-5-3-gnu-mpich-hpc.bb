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
This package contains all files needed to create projects that use \
the mpich version of NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran_4_5_3-gnu-mpich-hpc-4.5.3-4.6.aarch64.rpm"
RPM_HASH = "cfa442bdbc4f1a368c48b9ffac2263450af948603a945f12e9d01ff4fc25c92857e07d706e82cebbbb53bda6c95f0605b7d48d8fb44ce87f259a999c568b0155"

RPROVIDES:${PN} += "libnetcdf-fortran-4-5-3-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
