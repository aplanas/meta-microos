SUMMARY = "Program for producing font samples"
DESCRIPTION = "fntsample is a program for making font samples that show Unicode coverage of \
the font. The samples are similar in appearance to Unicode charts. \
 \
Features: \
* Support for various font formats using FreeType library, including TrueType, \
  OpenType, and Type1. \
* Creation of samples in PDF and PostScript format. \
* Addition of outlines with Unicode block names for PDF samples. \
* Selection of code ranges to show in charts. \
* Comparisons of two font files with highlighting of added glyphs."
LICENSE = "CC-PDDC & GPL-3.0-or-later"

PV = "5.4"

RPM_NAME = "fntsample-5.4-1.1.aarch64.rpm"
RPM_HASH = "013725b388b7800b59f91124b8da4383720bd3fd85a667a5cf064385cddf4d91f01fb06f3ed486882de3524c9ace40519841db4a9b576d4e0ee8a95adfc81c21"

RPROVIDES:${PN} += "fntsample"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
unicode-blocks"

inherit rpm
