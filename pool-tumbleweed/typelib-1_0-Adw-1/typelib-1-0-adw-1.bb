SUMMARY = "Introspection bindings for Adwaita"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the GObject Introspection bindings for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.5"

RPM_NAME = "typelib-1_0-Adw-1-1.3.5-1.1.aarch64.rpm"
RPM_HASH = "f87ab08982ba3b9f17f12ce42446ac5dfe9cfd5b51044a7ec830fcd9330a1306f30aa44faea343bf931f0b795eef9b0c09deeaeb655a8e5750e19fc535a746f6"

RPROVIDES:${PN} += "typelib-1-0-Adw-1 \
typelib-Adw"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
