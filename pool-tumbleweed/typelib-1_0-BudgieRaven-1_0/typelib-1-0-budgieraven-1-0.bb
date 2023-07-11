SUMMARY = "Raven Introspection bindings for the Budgie Desktop"
DESCRIPTION = "This package provides GObject Introspection files required for \
developing Budgie Raven plugins using interpreted languages, such as Python \
GObject Introspection bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "typelib-1_0-BudgieRaven-1_0-10.7.2+0-1.2.aarch64.rpm"
RPM_HASH = "e7aabb2b376bcfb23a374b93b45d58af633a1cbcfd5a1a887c959b7c6ad176220939c2132dfb306d193381d10e08012e8f0ecf26d4ad04a0e1c00f3514d27fb8"

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
