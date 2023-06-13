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
netpbm(aarch-64) \
pbmplus"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnetpbm.so.11()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
