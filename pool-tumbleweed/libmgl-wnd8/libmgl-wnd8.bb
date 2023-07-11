SUMMARY = "MathGL window library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl-wnd8-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "52ef16aff13a3fe5a7f6fc1c0f988bd6080b0ea70dcd99b8a891fdc567ccf1232bb32ee59dedca34bc7f335dc157682c112dbf40edad13e99479206f5a83f87d"

RPROVIDES:${PN} += "libmgl-wnd.so.8 \
libmgl-wnd8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
