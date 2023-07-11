SUMMARY = "EMF (Enhanced Metafile) to SVG conversion library"
DESCRIPTION = "Library for converting Enhanced Metafile (EMF and EMF+) files to the \
SVG format. It can be used for conversion of standalone EMF files, \
but more typically for files embedded in other file formats, e.g. \
Visio drawings."
LICENSE = "GPL-2.0-only"

PV = "1.1.0"

RPM_NAME = "libemf2svg1-1.1.0-2.14.aarch64.rpm"
RPM_HASH = "9310f10594639e3f817e9cbc93ae79088bce4640543987cf7def5904038a76965b84c06f0c54c9c7dee2050f6bd08837ddcf055f70c3ad377cc9bb47139d4a36"

RPROVIDES:${PN} += "libemf2svg.so.1 \
libemf2svg1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libm.so.6 \
libpng16.so.16"

inherit rpm
