SUMMARY = "Examples for mathgl library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package contains examples of using MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-examples-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "3d170376212a13a3f69aa5464e0eac7d8c760f182f543775c5055b3c8f7d1dd210d1b4a9f8adf218a1650e2f54f572564b96956dfb246ad77d6e659cb0194618"

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
libhpdf.so \
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
libwx-baseu-suse.so.8.0.0 \
libwx-gtk3u-core-suse.so.8.0.0 \
libz.so.1"

inherit rpm
