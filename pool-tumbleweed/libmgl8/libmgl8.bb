SUMMARY = "Library for making scientific graphics"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl8-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "f02d72700809600f22f5ad29bf9d1186dd94c531a6131bf16b145de38e76296ddeea37fc931aff0c6a2cf73256a0dbaa0e5bb52acf7c26b19a8c5c8a58928e0a"

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
libhpdf.so.2 \
libjpeg.so.8 \
libltdl.so.7 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
mathgl-fonts"

inherit rpm
