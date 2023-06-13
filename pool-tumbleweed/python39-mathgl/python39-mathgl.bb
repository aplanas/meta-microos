SUMMARY = "Library for making scientific graphics"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. MathGL \
integrates into FLTK, Qt and OpenGL applications."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "python39-mathgl-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "77a87d32d5a63c4168d89e2dbeaa77b6e276c339ea3a4122869745237904698ddc8414f529a175cbc67a377eb09f77bc709c5e7dcb4e0d4aee8950c9ae96bb45"

RPROVIDES:${PN} += "python39-mathgl \
python39-mathgl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libmgl.so.8()(64bit) \
libpython3.9.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python39-numpy"

inherit rpm
