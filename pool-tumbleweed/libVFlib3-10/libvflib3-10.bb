SUMMARY = "Versatile font library VFlib3"
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

RPM_NAME = "libVFlib3-10-3.7.2-1.10.aarch64.rpm"
RPM_HASH = "0578cc02dc3f8102a5b7d0cb62dbe45e328f225edb96b2b9be9927ad76a6b7b72ee063e4e9a4d5dbd1b41c23e0882e3e69aff5a05ddc5b390172eee1ef0b2507"

RPROVIDES:${PN} += "libVFlib3-10 \
libVFlib3.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libkpathsea.so.6 \
libm.so.6"

inherit rpm
