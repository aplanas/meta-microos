SUMMARY = "Xviewer pythonconsole plugin"
DESCRIPTION = "xviewer python console plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-pythonconsole-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "0c982788f7701cf47eec8f57ec0988cd61b23a9aeecf73b0dabba386f5d8e38c4742e4e6403f40cff4147ed0e011de74622ed3c31afa87676b829195e3ec5980"

RPROVIDES:${PN} += "xviewer-plugin-pythonconsole \
xviewer-plugins-/usr/lib64/xviewer/plugins/pythonconsole.plugin"

RDEPENDS:${PN} += "/bin/sh \
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
