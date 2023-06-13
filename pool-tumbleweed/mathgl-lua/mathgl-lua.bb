SUMMARY = "Lua interface for the MathGL library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package provides lua interface for MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-lua-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "06dc502689f0cc10f147e2988f2f2d190bab68c843f822088ae631f9426974748f1d7fbc4dd232795d9669efc28ac35f0e0aac44a716bc5f667c5e030efd432c"

RPROVIDES:${PN} += "mathgl-lua \
mathgl-lua(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
liblua5.1.so.5()(64bit) \
libm.so.6()(64bit) \
libmgl.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
