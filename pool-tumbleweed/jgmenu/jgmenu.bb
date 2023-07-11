SUMMARY = "Small X11 menu intended to be used with openbox and tint2"
DESCRIPTION = "jgmenu is a simple X11 menu intended to be used with tint2 and openbox."
LICENSE = "GPL-2.0-only"

PV = "4.4.1"

RPM_NAME = "jgmenu-4.4.1-1.3.aarch64.rpm"
RPM_HASH = "d855059a4544f42fe02ddb299ad321c6f8b957f09f801702195af70cb75f1d28ae62c415887dc197e1d418a534b31a3f6e0d89aac5fab49f5836d856c53f92a8"

RPROVIDES:${PN} += "jgmenu"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
librsvg-2.so.2 \
libxml2.so.2 \
typelib-GLib \
typelib-Gtk"

inherit rpm
