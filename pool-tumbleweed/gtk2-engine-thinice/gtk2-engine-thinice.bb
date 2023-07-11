SUMMARY = "ThinIce GTK+ 2 Theme Engine"
DESCRIPTION = "The ThinIce engine features thin edges and Icy Colors, and provides a \
simple mostly clean appearance many find satisfying."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-thinice-2.20.2-19.43.aarch64.rpm"
RPM_HASH = "5e1d60ab74a4a1bbca26892d601f8784ed88bc887ca15c3b999fb04aec108fea01e2264f31475088eecf0eb023b02598615ceefcb7230d21b5a504a3efedc6b2"

RPROVIDES:${PN} += "gtk2-engine-thinice \
libthinice.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
