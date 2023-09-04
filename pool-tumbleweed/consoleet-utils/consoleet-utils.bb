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

PV = "1.3"

RPM_NAME = "consoleet-utils-1.3-1.1.aarch64.rpm"
RPM_HASH = "efb5bd4112a1687df583082b10de8c28d3d62469828958383d0683ea656b3b5b7e24987cfaa66df44531ebd870ee84edf4b91fcceccd78abbb12d1cff79e6d4c"

RPROVIDES:${PN} += "consoleet-utils \
vfontas"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
