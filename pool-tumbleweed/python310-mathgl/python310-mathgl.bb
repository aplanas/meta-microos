SUMMARY = "Library for making scientific graphics"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. MathGL \
integrates into FLTK, Qt and OpenGL applications."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "python310-mathgl-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "4709de5146e20239760bf3dcb66726652579c5dba0b1be2c32b74160a8c9339527b4cab5531c6767a30c3ca9d70623a203b440e7e4e9db4b3d0baa819b5fd434"

RPROVIDES:${PN} += "python3-mathgl \
python310-mathgl \
python310-mathgl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libmgl.so.8()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-numpy"

inherit rpm
