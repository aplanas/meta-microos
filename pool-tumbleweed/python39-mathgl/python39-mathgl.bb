SUMMARY = "Library for making scientific graphics"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. MathGL \
integrates into FLTK, Qt and OpenGL applications."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "python39-mathgl-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "80f95dd13b17c5a0fdf0446d40159c07003bdb2e70d6539b422ef8501ac41fcd858669f895cd953f8609731c5d1629066b8c161108298c4b60dd1b34f63da8a6"

RPROVIDES:${PN} += "python39-mathgl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libpython3.9.so.1.0 \
libstdc++.so.6 \
python-abi \
python39-numpy"

inherit rpm
