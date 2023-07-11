SUMMARY = "Introspection bindings for the GNOME Bluetooth libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GObject Introspection bindings for the GNOME Bluetooth's \
libraries."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.34.5"

RPM_NAME = "typelib-1_0-GnomeBluetooth-1_0-3.34.5-2.8.aarch64.rpm"
RPM_HASH = "e1c2493238f9cbe4b2520264a76bacb54711837527f2c231e1301723c9e72c534d2b4daf7fd1489b1c3922cc28789ee4eae3d685ea4f9933996c951c43eca386"

RPROVIDES:${PN} += "typelib-1-0-GnomeBluetooth-1-0 \
typelib-GnomeBluetooth"

RDEPENDS:${PN} += "libgnome-bluetooth.so.13 \
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
