SUMMARY = "Computer algebra interface"
DESCRIPTION = "Xcas is an interface to perform computer algebra, function graphs, \
interactive geometry (2-d and 3-d), spreadsheet and statistics \
programmation. It may be used as a replacement for graphic calculators \
for example on netbooks."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0.27"

RPM_NAME = "xcas-1.9.0.27-4.6.aarch64.rpm"
RPM_HASH = "17a1e507c46d0d3f8f07602c006b3aaa231075e99f2959ef0afbe461eab4606d2a067924a4d5793d950be7b022ee9c592d1773b2c06773f48aaf7c0582491d37"

RPROVIDES:${PN} += "xcas"

RDEPENDS:${PN} += "giac \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libfltk-gl.so.1.3 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgiac.so.0 \
libgmp.so.10 \
libgsl.so.27 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
