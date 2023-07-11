SUMMARY = "Library for manipulating FITS data files"
DESCRIPTION = "CFITSIO is a library of C and Fortran subroutines for reading and writing data \
files in FITS (Flexible Image Transport System) data format. CFITSIO provides \
simple high-level routines for reading and writing FITS files that insulate the \
programmer from the internal complexities of the FITS format. CFITSIO also \
provides many advanced features for manipulating and filtering the information \
in FITS files."
LICENSE = "ISC"

PV = "4.2.0"

RPM_NAME = "libcfitsio10-4.2.0-2.4.aarch64.rpm"
RPM_HASH = "e5612b53f7e05767e1ba4e28bd6c2d694095a1d70416107faa6641f145d8ec8a27a89aea5d4af92ffad6879397e200e5cf5860a2d6e922b65e278349d9be2cc2"

RPROVIDES:${PN} += "libcfitsio.so.10 \
libcfitsio10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libm.so.6 \
libz.so.1"

inherit rpm
