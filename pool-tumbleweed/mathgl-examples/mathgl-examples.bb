SUMMARY = "Examples for mathgl library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package contains examples of using MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-examples-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "341cf03cf45ce9e4657e5d217b266f3911072c1c8f36bb6746749ebcf5a0cc4bc0fb23933bb010bb5ec4a1ace04aaf96006c2ef226d69d756708d0ced9e178fa"

RPROVIDES:${PN} += "mathgl-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libQt5Core.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
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
libmgl-fltk.so.8 \
libmgl-glut.so.8 \
libmgl-qt5.so.8 \
libmgl-wx.so.8 \
libmgl.so.8 \
libpng16.so.16 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libz.so.1"

inherit rpm
