SUMMARY = "Eog pythonconsole plugin"
DESCRIPTION = "The Eye of Gnome python console plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-pythonconsole-44.0-1.1.aarch64.rpm"
RPM_HASH = "2c85a1153612e7b21e640c946499a2fe59b491e22e497a579369a2950a00bba0f51afa2a8dc23f834c9f6f0c8149489e5d18245a99430b83d8f760a26f44dc47"

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
