SUMMARY = "Library for making scientific graphics"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl8-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "ed1382458ff1cce88fe4ec60d631b7afd292dbf61571db5ade282396666484f4ceb80bcb3835e59178b91d41506d4db8deb61c3b28d997be2ba69ae60cf316f6"

RPROVIDES:${PN} += "libmgl.so.8 \
libmgl8 \
mathgl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libgomp.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libhdf5.so.200 \
libhpdf.so \
libjpeg.so.8 \
libltdl.so.7 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
mathgl-fonts"

inherit rpm
