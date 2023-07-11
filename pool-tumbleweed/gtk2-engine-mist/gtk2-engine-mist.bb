SUMMARY = "Mist GTK+ 2 Theme Engine"
DESCRIPTION = "The Mist engine is a minimalist engine designed to provide a simple UI \
experience."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-mist-2.20.2-19.43.aarch64.rpm"
RPM_HASH = "e4243102d4b9a26439978aaaeb584dbe5b3a25317fb811aa5aa13e9ef14bbb2410f2d704cd33b7721916bc9c269e5cdfa66a11a5473df40852cfa98372dde359"

RPROVIDES:${PN} += "gtk2-engine-mist \
libmist.so"

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
