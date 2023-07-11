SUMMARY = "Xviewer export to directory plugin"
DESCRIPTION = "xviewer export to directory plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-export-to-folder-1.4.1-1.7.aarch64.rpm"
RPM_HASH = "7d4f8cb919c1dec2915731cb448a30e883cfad3620a9bf147082a3e2fc9a3e47eeddb5776f764751ac90b0aeee5ccbbf7ff5736396c782fd5b4094eae1a3cfb8"

RPROVIDES:${PN} += "xviewer-plugin-export-to-folder \
xviewer-plugins-/usr/lib64/xviewer/plugins/export-to-folder.plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-PeasGtk \
typelib-Xviewer \
xviewer-plugins-data"

inherit rpm
