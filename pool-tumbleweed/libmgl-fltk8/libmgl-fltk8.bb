SUMMARY = "MathGL FLTK widget library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl-fltk8-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "9698356d368aedc0c2977744805592117bdec1d92700d7db146a68af96c324a4e8b5681cb134e7406f8edcba6823b8a5110fec93b546c07d16ff379074912ff9"

RPROVIDES:${PN} += "libmgl-fltk.so.8 \
libmgl-fltk8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
