SUMMARY = "Higlevel GUI libraries for OpenCV"
DESCRIPTION = "Higlevel GUI libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_highgui407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "7be83d037965eb7d006c0fee2cc44fa440b0ddf9ee3a43997fb8e12d87f52e5d7bf40129bc7d8f11b658f9d3bf75b9155f5028771edeb95598ad93abcf463524"

RPROVIDES:${PN} += "libopencv_highgui.so.407()(64bit) \
libopencv_highgui407 \
libopencv_highgui407(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libOpenGL.so.0()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5OpenGL.so.5()(64bit) \
libQt5OpenGL.so.5(Qt_5)(64bit) \
libQt5Test.so.5()(64bit) \
libQt5Test.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_imgcodecs.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
