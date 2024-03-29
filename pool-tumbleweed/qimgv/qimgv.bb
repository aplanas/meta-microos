SUMMARY = "Qt5 image viewer"
DESCRIPTION = "Qt5 image viewer with webm support."
LICENSE = "GPL-3.0-only"

PV = "1.0.3a+git20230815.4c12677"

RPM_NAME = "qimgv-1.0.3a+git20230815.4c12677-1.1.aarch64.rpm"
RPM_HASH = "d2317e7be985886002e23469f45f863ab4c4b8458740d8313dde06d74fc0d916782869d3427d198bc1e99dce5221d0c7cb53549e900159c69ae8dd32a203198f"

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
