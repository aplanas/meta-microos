SUMMARY = "Library for making scientific graphics"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. MathGL \
integrates into FLTK, Qt and OpenGL applications."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "python311-mathgl-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "8a253fabdede4e75c2c046153853f6fd5d12ad63c3f6ce0bfd57d53ed0d57072a82cbb63f7d55b70523e8c174a615917577a33e00cff568880ec5c54f5725b90"

RPROVIDES:${PN} += "python3-mathgl \
python311-mathgl"

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
