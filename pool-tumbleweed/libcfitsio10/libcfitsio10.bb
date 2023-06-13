SUMMARY = "Library for manipulating FITS data files"
DESCRIPTION = "CFITSIO is a library of C and Fortran subroutines for reading and writing data \
files in FITS (Flexible Image Transport System) data format. CFITSIO provides \
simple high-level routines for reading and writing FITS files that insulate the \
programmer from the internal complexities of the FITS format. CFITSIO also \
provides many advanced features for manipulating and filtering the information \
in FITS files."
LICENSE = "ISC"

PV = "4.2.0"

RPM_NAME = "libcfitsio10-4.2.0-2.3.aarch64.rpm"
RPM_HASH = "07c6aa41bc0e3c0e9dc2b6e4b77ff52fb6a58f87cb57184035aff671bbe137e16e0f6929cfcb479fd7e3c5ab2d276b752b62e290d358c5f5cdb128dd08af15a2"

RPROVIDES:${PN} += "libcfitsio.so.10()(64bit) \
libcfitsio10 \
libcfitsio10(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libz.so.1()(64bit)"

inherit rpm
