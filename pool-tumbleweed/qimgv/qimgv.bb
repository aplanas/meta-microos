SUMMARY = "Qt5 image viewer"
DESCRIPTION = "Qt5 image viewer with webm support."
LICENSE = "GPL-3.0-only"

PV = "1.0.3a+git20221107.8ad0a11"

RPM_NAME = "qimgv-1.0.3a+git20221107.8ad0a11-1.3.aarch64.rpm"
RPM_HASH = "6de49783a53e1679709d7c1607b31b2456e81043f2ca935ef9436d556226f21d862b097ac9e048fcc995c380ac72ffe51b4fae21ac430dab4cada7cfa44a8523"

RPROVIDES:${PN} += "application() \
application(qimgv.desktop) \
metainfo() \
metainfo(qimgv.appdata.xml) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/png) \
mimehandler(image/webp) \
mimehandler(video/webm) \
qimgv \
qimgv(aarch-64)"
RDEPENDS:${PN} += "libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpv.so.2()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
mpv"

inherit rpm
