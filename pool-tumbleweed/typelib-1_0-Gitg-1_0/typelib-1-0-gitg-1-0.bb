SUMMARY = "Git repository viewer -- Library"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "typelib-1_0-Gitg-1_0-41-2.10.aarch64.rpm"
RPM_HASH = "3dcacd86b6b58e70422036d9645dc7f12b69c79a125e68618f16e5ee7e12783fa7349365d78b3e52453aeb8136c0a369125d53d2c348543829963eb28645836c"

RPROVIDES:${PN} += "typelib-1-0-Gitg-1-0 \
typelib-Gitg"

RDEPENDS:${PN} += "libgitg-1.0.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gee \
typelib-Ggit \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
