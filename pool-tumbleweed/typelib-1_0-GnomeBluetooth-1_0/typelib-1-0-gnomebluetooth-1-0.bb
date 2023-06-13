SUMMARY = "Introspection bindings for the GNOME Bluetooth libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GObject Introspection bindings for the GNOME Bluetooth's \
libraries."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.34.5"

RPM_NAME = "typelib-1_0-GnomeBluetooth-1_0-3.34.5-2.7.aarch64.rpm"
RPM_HASH = "9e8bf4f273c336fea1b74eba5b8f6153aeb55bbe6b209e4bca87906035bc18fd44db080965f88eafab52a758d42833a67d3d7f5b15b841b36a862ba202928ef7"

RPROVIDES:${PN} += "typelib(GnomeBluetooth) \
typelib-1_0-GnomeBluetooth-1_0 \
typelib-1_0-GnomeBluetooth-1_0(aarch-64)"

RDEPENDS:${PN} += "libgnome-bluetooth.so.13()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
