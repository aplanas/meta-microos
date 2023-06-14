SUMMARY = "Higlevel GUI libraries for OpenCV"
DESCRIPTION = "Higlevel GUI libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_highgui407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "7be83d037965eb7d006c0fee2cc44fa440b0ddf9ee3a43997fb8e12d87f52e5d7bf40129bc7d8f11b658f9d3bf75b9155f5028771edeb95598ad93abcf463524"

RPROVIDES:${PN} += "libopencv-highgui.so.407 \
libopencv-highgui407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Test.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.407 \
libopencv-imgcodecs.so.407 \
libopencv-imgproc.so.407 \
libstdc++.so.6"

inherit rpm
