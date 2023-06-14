SUMMARY = "Library for making scientific graphics"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. MathGL \
integrates into FLTK, Qt and OpenGL applications."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "python311-mathgl-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "a0c08a7d3666f65de953d043796975dfca8ed6e77b61886367f5b3f6afbdc9a7f4bb83ae094594d3498773644f341e1947d5fbb8b0e3c24f36e787d387a91c26"

RPROVIDES:${PN} += "python311-mathgl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi \
python311-numpy"

inherit rpm
