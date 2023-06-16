SUMMARY = "On-screen Keyboard for GNOME"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-0.4.21-8.7.aarch64.rpm"
RPM_HASH = "f893102d5230f6b6f6f13d2663ed736ce951694c45bb3a82dd7924633e6cd220179adb7299e709fcde892f4dc6d695004c9c904f330fd223e632a9004734c8c7"

RPROVIDES:${PN} += "caribou"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libatspi.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libwayland-server.so.0 \
python-abi \
python3-atspi \
python3-xml \
typelib-Caribou \
typelib-Clutter \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk"

inherit rpm
