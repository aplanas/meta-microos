SUMMARY = "Eog pythonconsole plugin"
DESCRIPTION = "The Eye of Gnome python console plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-pythonconsole-44.0-1.2.aarch64.rpm"
RPM_HASH = "270aded7aadec406876360f22047707ac1882354406c116de1db1761000d015e447209251c34a8965c6cc1ec592e9e473fe6106a8a7121e790f4b62a35e6c244"

RPROVIDES:${PN} += "eog-plugin-pythonconsole \
eog-plugins-/usr/lib64/eog/plugins/pythonconsole.plugin"

RDEPENDS:${PN} += "eog-plugins-data \
typelib-Eog \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PeasGtk"

inherit rpm
