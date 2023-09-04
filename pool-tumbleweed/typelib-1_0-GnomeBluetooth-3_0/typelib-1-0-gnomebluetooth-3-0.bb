SUMMARY = "Introspection bindings for the GNOME Bluetooth libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GObject Introspection bindings for the GNOME Bluetooth's \
libraries."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.6"

RPM_NAME = "typelib-1_0-GnomeBluetooth-3_0-42.6-1.1.aarch64.rpm"
RPM_HASH = "b694e6bdf2318d62eb9de32f61aee6c8dfd8c99bbf7f8566a8db9ea35cac075e0d3683face8d4a8a8766f735c22d960ecda9c8ecadcb6b8b7759c761b47e7678"

RPROVIDES:${PN} += "typelib-1-0-GnomeBluetooth-3-0 \
typelib-GnomeBluetooth"

RDEPENDS:${PN} += "libgnome-bluetooth-3.0.so.13 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
