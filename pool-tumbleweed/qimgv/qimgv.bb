SUMMARY = "Qt5 image viewer"
DESCRIPTION = "Qt5 image viewer with webm support."
LICENSE = "GPL-3.0-only"

PV = "1.0.3a+git20230615.e2675f1"

RPM_NAME = "qimgv-1.0.3a+git20230615.e2675f1-1.1.aarch64.rpm"
RPM_HASH = "0cefc73b052bbe10687daa60363fe5503d3dec77c24bc00b00cb7c6a1559343a5c24fc4311f8ccc42081442ed9f94c9999881f8e7fd1d09a3ec231d73bce0871"

RPROVIDES:${PN} += "qimgv"

RDEPENDS:${PN} += "libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libm.so.6 \
libmpv.so.2 \
libopencv-core.so.407 \
libopencv-imgproc.so.407 \
libstdc++.so.6 \
mpv"

inherit rpm
