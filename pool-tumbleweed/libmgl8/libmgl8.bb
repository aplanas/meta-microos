SUMMARY = "Library for making scientific graphics"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl8-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "ed1382458ff1cce88fe4ec60d631b7afd292dbf61571db5ade282396666484f4ceb80bcb3835e59178b91d41506d4db8deb61c3b28d997be2ba69ae60cf316f6"

RPROVIDES:${PN} += "libmgl.so.8()(64bit) \
libmgl8 \
libmgl8(aarch-64) \
mathgl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgif.so.7()(64bit) \
libgomp.so.1()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libhdf5.so.200()(64bit) \
libhpdf.so()(64bit) \
libjpeg.so.8()(64bit) \
libltdl.so.7()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
mathgl-fonts"

inherit rpm
