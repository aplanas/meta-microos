SUMMARY = "Lua interface for the MathGL library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package provides lua interface for MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-lua-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "33061ed8e540bfa80452ccfbac515302f2d752b055274e8fec52bf4db856e3d1feb78cc52c56e67a6a8b7b3f95ff0b36a20efc542abafb8ecafcb9d12a5be97f"

RPROVIDES:${PN} += "mathgl-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
liblua5.1.so.5 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
