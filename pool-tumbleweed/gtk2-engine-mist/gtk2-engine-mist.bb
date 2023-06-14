SUMMARY = "Mist GTK+ 2 Theme Engine"
DESCRIPTION = "The Mist engine is a minimalist engine designed to provide a simple UI \
experience."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-mist-2.20.2-19.42.aarch64.rpm"
RPM_HASH = "c807572effdf87bf88bae0005cf71a141c3c5370b06d7e24aa506c8c8122f48fd75ff95490a5056455d33246f5e56ca56fc407dd1421401b598691654444ad5a"

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
