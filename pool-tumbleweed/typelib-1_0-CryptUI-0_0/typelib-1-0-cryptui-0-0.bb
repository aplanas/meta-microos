SUMMARY = "Introspection bindings for libcryptui, a PGP key prompting library"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys. \
 \
This package provides the GObject Introspection bindings for \
libcryptui."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.12.2"

RPM_NAME = "typelib-1_0-CryptUI-0_0-3.12.2-10.4.aarch64.rpm"
RPM_HASH = "5d5bcc0f419328580d2954507ce832c5572392cf2fc107400c8274adc3788b9bf94c59fcd4f613f09367effff5a1c4c6a33012806c532ba44827b01d5946f915"

RPROVIDES:${PN} += "typelib-1-0-CryptUI-0-0 \
typelib-CryptUI"

RDEPENDS:${PN} += "libcryptui.so.0 \
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
