SUMMARY = "Git repository viewer -- Library"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "typelib-1_0-GitgExt-1_0-41-2.10.aarch64.rpm"
RPM_HASH = "fc973498d5d1e8d52a88aab51754b903f369eef9cd738608926cfb1c9f0128d8d59b86ca29eee111b4e5f0728222aafdfc5ab0c1af4f9e2737d4dfba4fe67cab"

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
