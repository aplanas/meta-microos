SUMMARY = "Raven Introspection bindings for the Budgie Desktop"
DESCRIPTION = "This package provides GObject Introspection files required for \
developing Budgie Raven plugins using interpreted languages, such as Python \
GObject Introspection bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "typelib-1_0-BudgieRaven-1_0-10.7.2+0-1.1.aarch64.rpm"
RPM_HASH = "714ad345c0cf51dc85a053dd436b1a2fada567fb18803b6225cac732bd471cebaa6d0bbf718c42afb3f1a50f87aec824c996abb91c9a5fe445d0f92a9bf20928"

RPROVIDES:${PN} += "typelib-1-0-BudgieRaven-1-0 \
typelib-BudgieRaven"

RDEPENDS:${PN} += "libbudgie-raven-plugin.so.0 \
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
