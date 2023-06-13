SUMMARY = "Extensions app for GNOME Shell"
DESCRIPTION = "This package contains an optional extensions app for managing GNOME Shell extensions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-extensions-44.1-1.1.aarch64.rpm"
RPM_HASH = "33bf1f3100c4e10a037fd79d2af8d429e53c18e3a9c5a664d27b7ef03a70ec1f2850008c70cbb836511a7d6973d4bb378a113f9086dadcc42fdc40f3f158f45b"

RPROVIDES:${PN} += "application() \
application(org.gnome.Extensions.desktop) \
gnome-extensions \
gnome-extensions(aarch-64) \
metainfo() \
metainfo(org.gnome.Extensions.metainfo.xml)"

RDEPENDS:${PN} += "/bin/sh \
gnome-shell \
typelib(Adw) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Gtk) \
typelib(Shew)"

inherit rpm
