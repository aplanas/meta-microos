SUMMARY = "MATE Desktop keyboard configuration typelib"
DESCRIPTION = "This package provides libmatekdb, an API to manage the keyboard in \
MATE Desktop applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "typelib-1_0-Matekbd-1_0-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "a7025681cddf64ae2d22ae7ded4b363f13e95b16701f3a4b7edf3e566be836e591d3825b50457fa99453c7ebcf96e1fe41b750836655b2502d13eeb4986bcc10"

RPROVIDES:${PN} += "typelib-1-0-Matekbd-1-0 \
typelib-Matekbd"

RDEPENDS:${PN} += "libmatekbd.so.4 \
libmatekbdui.so.4 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-Xkl \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
