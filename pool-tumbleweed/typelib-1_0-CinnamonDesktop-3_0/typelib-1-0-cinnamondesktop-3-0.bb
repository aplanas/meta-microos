SUMMARY = "Libcinnamon-desktop API -- Introspection bindings"
DESCRIPTION = "cinnamon-desktop contains the libcinnamon-desktop library, the \
cinnamon-about program as well as some desktop-wide documents. \
 \
This package provides the GObject Introspection bindings for \
libcinnamon-desktop."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.8.0"

RPM_NAME = "typelib-1_0-CinnamonDesktop-3_0-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "f93bc369f225621674ea78a128872f9f2c910fc93bca41f58e6f18e17d32de05fcc5fc8c29b6e54f88c6bf22bb225c6dbd8c394aa4d85c6c44c4ad4b37f0c77a"

RPROVIDES:${PN} += "typelib-1-0-CinnamonDesktop-3-0 \
typelib-CDesktopEnums \
typelib-CinnamonDesktop"

RDEPENDS:${PN} += "libcinnamon-desktop.so.4 \
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
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
