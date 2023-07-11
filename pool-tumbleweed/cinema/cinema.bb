SUMMARY = "A video player for local files"
DESCRIPTION = "A video player for watching local video files."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "cinema-1.1.2-1.25.aarch64.rpm"
RPM_HASH = "18896d343aa1d285805b90fce0cad768d37d2d28edfa6c59cfd744afb9834f443ccf7cb6ebc9f074e1f8d387f7185a086eeb1fa1a7b2880be84743b4dfcb1f0f"

RPROVIDES:${PN} += "cinema"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclutter-1.0.so.0 \
libclutter-gst-3.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libsoup-2.4.so.1 \
libsqlite3.so.0"

inherit rpm
