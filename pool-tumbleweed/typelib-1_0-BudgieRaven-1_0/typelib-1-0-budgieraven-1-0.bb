SUMMARY = "Raven Introspection bindings for the Budgie Desktop"
DESCRIPTION = "This package provides GObject Introspection files required for \
developing Budgie Raven plugins using interpreted languages, such as Python \
GObject Introspection bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.8+0"

RPM_NAME = "typelib-1_0-BudgieRaven-1_0-10.8+0-1.1.aarch64.rpm"
RPM_HASH = "4285be6ba047b70a5815ec1ea59d36dff12ba0f983887a34e8e4e83d0cdf9af35d61dc52eb0286525df897e4c7e34b2c3b36f02e6dd056d4c9d95b5998e04853"

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
