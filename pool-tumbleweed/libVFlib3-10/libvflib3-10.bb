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

RPM_NAME = "libVFlib3-10-3.7.2-1.9.aarch64.rpm"
RPM_HASH = "729b28adfb4f02f906bfacc3576c840442e6dd0d30b05557f8423f990651a062c33fd8b1ea95d51b97177a41fbdd8df1ef17d51eb444f55a85a622735c766a5e"

RPROVIDES:${PN} += "libVFlib3-10 \
libVFlib3.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libkpathsea.so.6 \
libm.so.6"

inherit rpm
