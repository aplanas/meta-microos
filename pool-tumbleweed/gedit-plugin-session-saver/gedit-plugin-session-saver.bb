SUMMARY = "Gedit session-saver plugin"
DESCRIPTION = "The gedit session-saver plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-session-saver-44.1-1.3.aarch64.rpm"
RPM_HASH = "7bf45ed40bbf65bc043e3fb806e508c4b489cff829d73d8ebb722906dde073fdf0b24ba3f27abf76b14ec1c07ab017920432f06f4e0753b060c4b685dd965195"

RPROVIDES:${PN} += "gedit-plugin-session-saver \
gedit-plugin-session-saver(aarch-64) \
gedit-plugins:/usr/lib64/gedit/plugins/session-saver.plugin"

RDEPENDS:${PN} += "gedit-plugins-data \
typelib(GLib) \
typelib(GObject) \
typelib(Gedit) \
typelib(Gio) \
typelib(Gtk) \
typelib(GtkSource) \
typelib(PeasGtk) \
typelib(Tepl)"

inherit rpm
