SUMMARY = "Extensions app for GNOME Shell"
DESCRIPTION = "This package contains an optional extensions app for managing GNOME Shell extensions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-extensions-44.2-1.1.aarch64.rpm"
RPM_HASH = "673113d7548297273d7abab128652db8cffb9af8027d1b42579d95d69d4393044fd690b40673270cbbd6959a147f18e3f6da4dd919ec1bc414f5056805a74b15"

RPROVIDES:${PN} += "gnome-extensions"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-shell \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-Shew"

inherit rpm
