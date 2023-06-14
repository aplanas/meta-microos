SUMMARY = "Development files for the X11 font encoding library"
DESCRIPTION = "The libfontenc library is used by the Xorg server and other X font \
tools for handling fonts with different character set encodings. \
 \
This package contains the development headers for the library found \
in libfontenc1."
LICENSE = "MIT"

PV = "1.1.7"

RPM_NAME = "libfontenc-devel-1.1.7-1.2.aarch64.rpm"
RPM_HASH = "087a5123247eb7231bfd2c0cc22616709ccf7fbb9c512659f19b26da9e77fd73b5fca1354b9828228fd4c2e3bbad7badb751ea41889bc81a0cfdf69500276a02"

RPROVIDES:${PN} += "libfontenc-devel \
pkgconfig-fontenc \
xorg-x11-libfontenc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfontenc1"

inherit rpm
