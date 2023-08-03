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

PV = "1.2"

RPM_NAME = "consoleet-utils-1.2-1.1.aarch64.rpm"
RPM_HASH = "f60731ee7c2e1b978327f5aed6d589e8f97e9f85a4b3bd79704020b04fc1bfa371abf681ade7afd8b96d5f6cfa51f03da18447720fa87ff3848fda1c2199dc4d"

RPROVIDES:${PN} += "consoleet-utils \
vfontas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
