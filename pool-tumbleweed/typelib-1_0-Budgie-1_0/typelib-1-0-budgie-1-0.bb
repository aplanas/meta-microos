SUMMARY = "Main Introspection bindings for the Budgie Desktop"
DESCRIPTION = "This package provides GObject Introspection files required for \
developing Budgie Applets using interpreted languages, such as Python \
GObject Introspection bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "typelib-1_0-Budgie-1_0-10.7.2+0-1.2.aarch64.rpm"
RPM_HASH = "3f25a5b34678545953fce232743a8c29ae0be692d74b9dddef88e94914347f36e7ed3957d4b1cda17dcc6ba921992615bcee5bf5c8f6769aafb14c69882525cf"

RPROVIDES:${PN} += "typelib-1-0-Budgie-1-0 \
typelib-Budgie"

RDEPENDS:${PN} += "libbudgie-plugin.so.0 \
typelib-1-0-PeasGtk-1-0 \
typelib-Atk \
typelib-GIRepository \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-Peas \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
