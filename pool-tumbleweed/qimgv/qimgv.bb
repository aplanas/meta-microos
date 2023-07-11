SUMMARY = "Qt5 image viewer"
DESCRIPTION = "Qt5 image viewer with webm support."
LICENSE = "GPL-3.0-only"

PV = "1.0.3a+git20221107.8ad0a11"

RPM_NAME = "qimgv-1.0.3a+git20221107.8ad0a11-1.4.aarch64.rpm"
RPM_HASH = "fb73c660f47cfc513d597c7f58968f7d5b8f63b8b693291811e4924dc8a0866a6df687307ab61e033dd929386e0f201f409a88acb1afcfe065dce42d0f6a1646"

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
