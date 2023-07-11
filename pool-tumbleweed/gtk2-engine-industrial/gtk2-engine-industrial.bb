SUMMARY = "Industrial GTK+ 2 Theme Engine"
DESCRIPTION = "The Industrial engine provides a simple and consistent appearance for \
applications."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-industrial-2.20.2-19.43.aarch64.rpm"
RPM_HASH = "b81f6dd2ada17a96e5c86913860376ea8dab5a293cf9e67a711d6a93dc67194c1caec191dfa746f4b904f88239748b882cea8f688ffbe4ab25455101af03616c"

RPROVIDES:${PN} += "gtk2-engine-industrial \
libindustrial.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
