SUMMARY = "Main Introspection bindings for the Budgie Desktop"
DESCRIPTION = "This package provides GObject Introspection files required for \
developing Budgie Applets using interpreted languages, such as Python \
GObject Introspection bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.8+0"

RPM_NAME = "typelib-1_0-Budgie-1_0-10.8+0-1.1.aarch64.rpm"
RPM_HASH = "58b64bd47fcaba98ea09c73044b7a5b9a30cda1be4aa7aa655e60a934682be6b06318c1fd021ddc415cc27fb3ebb1ac7c743b18d90439a48269be67febe08c6e"

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
