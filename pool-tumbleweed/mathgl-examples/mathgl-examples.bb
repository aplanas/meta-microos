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

RPROVIDES:${PN} += "mathgl-examples \
mathgl-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5OpenGL.so.5()(64bit) \
libQt5OpenGL.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
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
libmgl-fltk.so.8()(64bit) \
libmgl-glut.so.8()(64bit) \
libmgl-qt5.so.8()(64bit) \
libmgl-wx.so.8()(64bit) \
libmgl.so.8()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.8.0.0()(64bit) \
libwx_gtk3u_core-suse.so.8.0.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
