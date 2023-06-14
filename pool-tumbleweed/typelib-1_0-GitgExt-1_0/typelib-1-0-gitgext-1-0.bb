SUMMARY = "Git repository viewer -- Library"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "typelib-1_0-GitgExt-1_0-41-2.8.aarch64.rpm"
RPM_HASH = "3ae122f9524794a19820a92e3bcb2484b3916ded138448f11f709f63c3b8aed5d8aaaf29615b5f580560794b6daa8a6284222e58f58f3b8c369c009d45404d4b"

RPROVIDES:${PN} += "typelib-1-0-GitgExt-1-0 \
typelib-GitgExt"

RDEPENDS:${PN} += "libgitg-ext-1.0.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gee \
typelib-Ggit \
typelib-Gio \
typelib-Gitg \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
