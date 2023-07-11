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

RPM_NAME = "consoleet-utils-1.1-1.4.aarch64.rpm"
RPM_HASH = "6f6d2c99f0717a770b18c1e4db019ae670d24b48c622d30328766bc8ac6192a9d27281da03f5fb255d3233da4797dcc91f909cadcd0f487e8fe266b3ede4939f"

RPROVIDES:${PN} += "consoleet-utils \
vfontas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
