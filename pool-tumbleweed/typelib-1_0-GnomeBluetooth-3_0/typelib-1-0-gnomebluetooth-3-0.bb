SUMMARY = "Introspection bindings for the GNOME Bluetooth libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GObject Introspection bindings for the GNOME Bluetooth's \
libraries."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.5"

RPM_NAME = "typelib-1_0-GnomeBluetooth-3_0-42.5-1.4.aarch64.rpm"
RPM_HASH = "dedf82d0a9a195beccc4f92de35a7844c9dbf06941ae5f3c25db2ad4130b7ed9d1f4d12f38e7de6535f102176e5e735b75e00b718abcaa2e2466a874bf790962"

RPROVIDES:${PN} += "typelib-1-0-GnomeBluetooth-3-0 \
typelib-GnomeBluetooth"

RDEPENDS:${PN} += "libgnome-bluetooth-3.0.so.13 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
