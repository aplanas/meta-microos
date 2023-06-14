SUMMARY = "Utilities for manipulating terminal fonts and colors"
DESCRIPTION = "This is a set of utilities for manipulating terminal fonts and \
colors. \
 \
A key component is vfontas, which can read/write bitmap fonts from/to \
a number of formats and transform the glyphs in various ways. vfontas \
is able to generate outline fonts from bitmapped fonts, including a \
high-quality mode that upscales based on outline rather than pixel \
blocks, setting it apart from scalers like xBRZ or potrace."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "1.1"

RPM_NAME = "consoleet-utils-1.1-1.3.aarch64.rpm"
RPM_HASH = "050093abb48919faf53ca18210debb6a22fa8f2cc98a6ec859be55f3750c9d4bd669c4ac364e4006c22cf4eefa4493a6d293668200c73e015e1bb721355e71a5"

RPROVIDES:${PN} += "consoleet-utils \
vfontas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
