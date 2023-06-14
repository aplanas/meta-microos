SUMMARY = "A Graphics Conversion Package"
DESCRIPTION = "These are the Portable Bitmap Plus Utilities. \
 \
This package provides tools for graphics conversion. Using these \
tools, images can be converted from virtually any format into any \
other format. A few of the supported formats include: GIF, \
PC-Paintbrush, IFF ILBM, Gould Scanner file, MTV ray tracer, Atari \
Degas .pi1 and .pi3, Macintosh PICT, HP Paintjet file, QRT raytracer, \
AUTOCAD slide, Atari Spectrum (compressed and uncompressed), Andrew \
Toolkit raster object, and many more. On top of that, man pages are \
included for all tools."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & IJG & MIT & SUSE-Public-Domain"

PV = "10.96.4"

RPM_NAME = "netpbm-10.96.4-5.3.aarch64.rpm"
RPM_HASH = "86a349ada18e4c60d26f6136178aa801275044791a6f162426e1a5bf622dbf8b4f424903de345d370bf449a1e2349b02422fce0561e5fcad3cb1c1c2d70dd9f3"

RPROVIDES:${PN} += "netpbm \
pbmplus"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libnetpbm.so.11 \
libpng16.so.16 \
libtiff.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
