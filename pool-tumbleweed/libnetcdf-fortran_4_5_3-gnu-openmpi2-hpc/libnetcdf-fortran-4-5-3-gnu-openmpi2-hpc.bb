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
the openmpi version of NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran_4_5_3-gnu-openmpi2-hpc-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "9de6c007d23c51a3849df4ef8d81fd17447306d1e72028096f91222ac86cc94d280dfcb48c1dceb010d30216d53c738aa82671dd366fa8a01b70c48fa3769def"

RPROVIDES:${PN} += "libnetcdf-fortran_4_5_3-gnu-openmpi2-hpc \
libnetcdf-fortran_4_5_3-gnu-openmpi2-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libopenmpi2-gnu-hpc \
lua-lmod"

inherit rpm
