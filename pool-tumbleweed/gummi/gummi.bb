SUMMARY = "Simple LaTeX editor"
DESCRIPTION = "Gummi is a LaTeX editor written using the GTK+ toolkit. It was designed with \
simplicity in mind, but is useful for both novice and advanced LaTeX writers."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "gummi-0.8.3-1.7.aarch64.rpm"
RPM_HASH = "f4a948599d94d051033ae622efa3ce08a7a5929a4b7417ad60dee3e071752fd674c69b0a0b50ec8b82e2fecb7d18afc661180c4d1627f6857cd213a7a378b43f"

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
