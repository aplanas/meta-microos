SUMMARY = "Extensions app for GNOME Shell"
DESCRIPTION = "This package contains an optional extensions app for managing GNOME Shell extensions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.4"

RPM_NAME = "gnome-extensions-44.4-1.1.aarch64.rpm"
RPM_HASH = "747cc36712cbb7c28b411e39657e744576684a5a42c4d938a6b81f48e659dd5015d0dd74df10e6814e64fe67cc039a61e6ae143e75dba38c9e5545327d2f3d1a"

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
