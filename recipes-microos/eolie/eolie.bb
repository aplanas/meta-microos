SUMMARY = "Web browser for GNOME"
DESCRIPTION = "Eolie is a Web browser for the GNOME Desktop. It provides: \
* Firefox sync support \
* Secret password store \
* A modern UI"
LICENSE = "GPL-3.0-or-later"

PV = "0.9.101"

RPM_NAME = "eolie-0.9.101-1.10.noarch.rpm"
RPM_HASH = "e51746d629d993070eb425199a68cffc2e8b08416d86f45f3a22bbdb92745dd4c7317e86034a0c6333a04528a75b55702618713942f3bf77dd64e9817e40e63d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.gnome.Eolie.desktop) eolie metainfo() metainfo(org.gnome.Eolie.appdata.xml) mimehandler(application/x-mimearchive) mimehandler(application/xhtml+xml) mimehandler(multipart/related) mimehandler(text/html) mimehandler(text/xml) mimehandler(x-scheme-handler/http) mimehandler(x-scheme-handler/https)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-cairo python3-dateutil python3-gobject typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(GtkSpell) typelib(Handy) typelib(Pango) typelib(Secret) typelib(Soup) typelib(WebKit2)"

inherit rpm
