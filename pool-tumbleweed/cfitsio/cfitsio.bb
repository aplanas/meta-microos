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

PV = "4.3.0"

RPM_NAME = "cfitsio-4.3.0-1.1.aarch64.rpm"
RPM_HASH = "a166adba4c451847bf3fbaaed4987127e61caf850bdd2c6ab9f7b47ecb99928958af04b8f7aa0464d32a5d0d73de29eb1f4ddbc7e2532eab6f6899b49eb446de"

RPROVIDES:${PN} += "cfitsio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libm.so.6"

inherit rpm
