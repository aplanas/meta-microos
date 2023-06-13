SUMMARY = "Glide GTK+ 2 Theme Engine"
DESCRIPTION = "This packages provides the Glide engine for GTK+ 2, originally written \
for the Glider theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-glide-2.20.2-19.42.aarch64.rpm"
RPM_HASH = "d4fed3087883c1583d141a631a06b51260255073215c8dff116ff04db552b8193828c12d2bd0466c414ca5ef73a4dbb6666cadae6a53680f1c851ca04e895ea6"

RPROVIDES:${PN} += "gtk2-engine-glide \
gtk2-engine-glide(aarch-64) \
libglide.so()(64bit)"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
