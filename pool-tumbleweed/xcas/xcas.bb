SUMMARY = "Computer algebra interface"
DESCRIPTION = "Xcas is an interface to perform computer algebra, function graphs, \
interactive geometry (2-d and 3-d), spreadsheet and statistics \
programmation. It may be used as a replacement for graphic calculators \
for example on netbooks."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0.27"

RPM_NAME = "xcas-1.9.0.27-4.5.aarch64.rpm"
RPM_HASH = "ad2ea1b0ff5cd9c3c9dd7671ef56796c46e19456881ac25ff198bbd2c1a7dc5fd4d6f2851807039b161496a38692ffc9e179fb2bcb1d889dab6df09a1561a5a3"

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
