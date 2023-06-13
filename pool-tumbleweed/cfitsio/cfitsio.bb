SUMMARY = "Library for manipulating FITS data files"
DESCRIPTION = "CFITSIO is a library of C and Fortran subroutines for reading and writing data \
files in FITS (Flexible Image Transport System) data format. CFITSIO provides \
simple high-level routines for reading and writing FITS files that insulate the \
programmer from the internal complexities of the FITS format. CFITSIO also \
provides many advanced features for manipulating and filtering the information \
in FITS files. \
 \
This package contains some FITS image compression and decompression utilities."
LICENSE = "ISC"

PV = "4.2.0"

RPM_NAME = "cfitsio-4.2.0-2.3.aarch64.rpm"
RPM_HASH = "3186f283391325e0deae9c4a5ea4d844a934c965c06003942d3d1622a7bb1c3f1f6c229dac549f949ce41b339ce2af5e64da49c7f1b1b380862c52811d080e3e"

RPROVIDES:${PN} += "cfitsio \
cfitsio(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcfitsio.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
