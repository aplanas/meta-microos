SUMMARY = "Xviewer pythonconsole plugin"
DESCRIPTION = "xviewer python console plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-pythonconsole-1.4.1-1.7.aarch64.rpm"
RPM_HASH = "eb5a90387cc0c9ebdf94009250d68156d9ad336cd8df59aaea47ce728b18bff1635cb24999186fcc34e58baa222f38633e521efa923fbfa87e80569f09973e91"

RPROVIDES:${PN} += "xviewer-plugin-pythonconsole \
xviewer-plugins-/usr/lib64/xviewer/plugins/pythonconsole.plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PeasGtk \
typelib-Xviewer \
xviewer-plugins-data"

inherit rpm
