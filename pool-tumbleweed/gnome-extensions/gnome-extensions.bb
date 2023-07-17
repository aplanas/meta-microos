SUMMARY = "Extensions app for GNOME Shell"
DESCRIPTION = "This package contains an optional extensions app for managing GNOME Shell extensions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.3"

RPM_NAME = "gnome-extensions-44.3-1.1.aarch64.rpm"
RPM_HASH = "5a435994c370bae93945915adcd57e66b78df3ac42e5f65408b408931d55e86656637d09cf9afcb3a433b323cd7ea92f6a88b397c16bb94d90fa2bcd6e64483d"

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
