SUMMARY = "Simple LaTeX editor"
DESCRIPTION = "Gummi is a LaTeX editor written using the GTK+ toolkit. It was designed with \
simplicity in mind, but is useful for both novice and advanced LaTeX writers."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "gummi-0.8.3-1.6.aarch64.rpm"
RPM_HASH = "6d685289cdaf9f8b53956ed6f3d7bfefbaefb6353676f7f0711431f7f805b504c6b7225deee61eac212d084ffd10c0b49f15a3242c0453ec82c25dc50886badd"

RPROVIDES:${PN} += "gummi"

RDEPENDS:${PN} += "/usr/bin/sh \
gtkspell \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libgtkspell3-3.so.0 \
libpango-1.0.so.0 \
libpoppler-glib.so.8 \
libsynctex.so.2 \
texlive-latex"

inherit rpm
