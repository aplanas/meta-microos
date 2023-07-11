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

RPM_NAME = "VFlib3-3.7.2-1.10.aarch64.rpm"
RPM_HASH = "dbf11c68faa313d484809483c0d6aebf8930eb455cea7aa7d0f8ad9b441460bab87c081828fe06fd750fc72c9d30cad912b319bd044c797b8104ca71938668af"

RPROVIDES:${PN} += "VFlib3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libVFlib3.so.10 \
libX11.so.6 \
libc.so.6 \
libkpathsea.so.6"

inherit rpm
