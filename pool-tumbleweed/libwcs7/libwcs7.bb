SUMMARY = "An implementation of the FITS WCS standard"
DESCRIPTION = "WCSLIB is a C library, supplied with a full set of Fortran wrappers, that \
implements the 'World Coordinate System' (WCS) standard in FITS (Flexible Image \
Transport System)."
LICENSE = "LGPL-3.0-or-later"

PV = "7.12"

RPM_NAME = "libwcs7-7.12-1.7.aarch64.rpm"
RPM_HASH = "a24885e73b071227781a0224f8b2cbce721c894e7373a85ab15b571b97f36e8ecc1c96f5ee233b24766429dd8e11862889dc320423ca89c8c69112220178960b"

RPROVIDES:${PN} += "libwcs.so.7 \
libwcs7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
