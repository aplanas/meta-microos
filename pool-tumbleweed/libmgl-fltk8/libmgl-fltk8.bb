SUMMARY = "MathGL FLTK widget library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl-fltk8-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "06389c682fb9882c0e65e09700f795e6b46e0e10a21ac9f66f3283e24c8a089a385186602ea824fe455586c8b4e80fcaada2e7454d0131be3e4f1afc4b62b675"

RPROVIDES:${PN} += "libmgl-fltk.so.8 \
libmgl-fltk8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
