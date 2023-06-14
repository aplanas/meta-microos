SUMMARY = "An implementation of the FITS WCS standard"
DESCRIPTION = "WCSLIB is a C library, supplied with a full set of Fortran wrappers, that \
implements the 'World Coordinate System' (WCS) standard in FITS (Flexible Image \
Transport System)."
LICENSE = "LGPL-3.0-or-later"

PV = "7.12"

RPM_NAME = "libwcs7-7.12-1.6.aarch64.rpm"
RPM_HASH = "99d03cd710be28bb473e932c582087871ca410358a5be4602267346651c79615ebbdd17a156e4c0b17e0ac95e4689c7f1e08499a75f8d7a7ad4ac9d1857303a0"

RPROVIDES:${PN} += "libwcs.so.7 \
libwcs7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
