SUMMARY = "On-screen Keyboard for GNOME -- Introspection bindings"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device. \
 \
This package provides the GObject Introspection bindings for the caribou \
library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "typelib-1_0-Caribou-1_0-0.4.21-8.8.aarch64.rpm"
RPM_HASH = "051aa89d12d9a431c454ef76a3b889273a3800ee07705dec41ea16d2f4fcb7adf39410efda8df06b580baa611e689497e083ad50332187eda6d127f842629ce0"

RPROVIDES:${PN} += "typelib-1-0-Caribou-1-0 \
typelib-Caribou"

RDEPENDS:${PN} += "libcaribou.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2"

inherit rpm
