SUMMARY = "Library for making scientific graphics"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. MathGL \
integrates into FLTK, Qt and OpenGL applications."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "python310-mathgl-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "4dd934bceabd24c41e1c9da4021ecc86214cc64c18ed80e1d5cb3dcaf95f8c28ba4def8d16c8b46d22fde5260be4f3a8d4df631bfbd13b1e91c72dd244da6f99"

RPROVIDES:${PN} += "python310-mathgl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
