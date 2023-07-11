SUMMARY = "Higlevel GUI libraries for OpenCV"
DESCRIPTION = "Higlevel GUI libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_highgui407-4.7.0-1.8.aarch64.rpm"
RPM_HASH = "20c6be392139d77b85eeb4d265c25a56b7efc385b34e5b14b0da6157ad01d900b59545938070b6c35e1ec27b3472d9ea62696e51c11162a00261c3abd09bb824"

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
