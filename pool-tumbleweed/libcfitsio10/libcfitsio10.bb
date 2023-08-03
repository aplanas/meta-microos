SUMMARY = "Library for manipulating FITS data files"
DESCRIPTION = "CFITSIO is a library of C and Fortran subroutines for reading and writing data \
files in FITS (Flexible Image Transport System) data format. CFITSIO provides \
simple high-level routines for reading and writing FITS files that insulate the \
programmer from the internal complexities of the FITS format. CFITSIO also \
provides many advanced features for manipulating and filtering the information \
in FITS files."
LICENSE = "ISC"

PV = "4.3.0"

RPM_NAME = "libcfitsio10-4.3.0-1.1.aarch64.rpm"
RPM_HASH = "51dc9e8b3e39b4f1109005143821eec97625a899365fe178c2625f1c0dcffcbe6eb419205b8c79f65f0ee3ab73d3a0cfdae3750f9edf26ccce5cc85d12f18cdc"

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
