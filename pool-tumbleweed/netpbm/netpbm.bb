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

PV = "11.2.0"

RPM_NAME = "netpbm-11.2.0-1.1.aarch64.rpm"
RPM_HASH = "9a3300bf74f865f3cf5917f11d1cb878f4a87b2e0c733eccde04b17ff315c3927874be14d0ea9189f67f8165bcf8d71ee9577229198a42a7a49713aa51f8961f"

RPROVIDES:${PN} += "netpbm \
pbmplus"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
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
