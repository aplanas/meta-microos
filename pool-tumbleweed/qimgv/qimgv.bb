SUMMARY = "Qt5 image viewer"
DESCRIPTION = "Qt5 image viewer with webm support."
LICENSE = "GPL-3.0-only"

PV = "1.0.3a+git20221107.8ad0a11"

RPM_NAME = "qimgv-1.0.3a+git20221107.8ad0a11-1.3.aarch64.rpm"
RPM_HASH = "6de49783a53e1679709d7c1607b31b2456e81043f2ca935ef9436d556226f21d862b097ac9e048fcc995c380ac72ffe51b4fae21ac430dab4cada7cfa44a8523"

RPROVIDES:${PN} += "qimgv"

RDEPENDS:${PN} += "libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libexiv2.so.27 \
libgcc-s.so.1 \
libm.so.6 \
libmpv.so.2 \
libopencv-core.so.407 \
libopencv-imgproc.so.407 \
libstdc++.so.6 \
mpv"

inherit rpm
