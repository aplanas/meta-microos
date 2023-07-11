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

RPM_NAME = "cfitsio-4.2.0-2.4.aarch64.rpm"
RPM_HASH = "f0a543a22e86c870c68780a81e3bd910261d09223ed26694b028966ceb6643edcade9d6a7aa26e0537b4d58067897477ef073a9e2843b8e8931069d823c909e8"

RPROVIDES:${PN} += "cfitsio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libm.so.6"

inherit rpm
