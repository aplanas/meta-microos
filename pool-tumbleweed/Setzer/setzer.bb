SUMMARY = "Simple yet full-featured LaTeX editor for GTK/GNOME"
DESCRIPTION = "Setzer is an easy to use yet full-featured LaTeX editor for the GNU/Linux \
desktop, written in Python with Gtk."
LICENSE = "GPL-3.0-or-later"

PV = "56"

RPM_NAME = "Setzer-56-1.1.noarch.rpm"
RPM_HASH = "b9f9253174fdd1de2d842522c18682c9c3acad3e8c524442cc728ec6fe75047a70bfda7869a796ee25916d70feef655945151331f8860d6e276c6c8a4f57685c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Setzer"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-bibtexparser \
python3-cairo \
python3-gobject-Gdk \
python3-pexpect \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gspell \
typelib-Gtk \
typelib-GtkSource \
typelib-Handy \
typelib-Pango \
typelib-PangoCairo \
typelib-Poppler \
typelib-WebKit2 \
typelib-Xdp \
typelib-cairo"

inherit rpm
