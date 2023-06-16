SUMMARY = "Versatile Font Library"
DESCRIPTION = "VFlib is a font library written in C language with several functions to \
obtain bitmaps of fonts. A unique feature of VFlib is that fonts in \
different formats are accessed by unified interface. \
 \
VFlib supports the following font formats: \
* TeX fonts: PK, GF, VF, TFM Omega \
* TeX fonts: OFM (level 0), OVF \
* X Window fonts: PCF, BDF. \
* Other fonts: TrueType, Type 1, HBF, Syotai Club, JG, ekanji"
LICENSE = "LGPL-2.1-or-later"

PV = "3.7.2"

RPM_NAME = "VFlib3-3.7.2-1.9.aarch64.rpm"
RPM_HASH = "aca52968accb822c82c270f032904158b9ab90a8c585ed3365561fe8988ed8a0abebfb8ded26b86e91b6980cc817a0e425b0ea56c31d57e88b7fbd707418fc7d"

RPROVIDES:${PN} += "VFlib3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libVFlib3.so.10 \
libX11.so.6 \
libc.so.6 \
libkpathsea.so.6"

inherit rpm
