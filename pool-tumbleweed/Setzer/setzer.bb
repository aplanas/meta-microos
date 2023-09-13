SUMMARY = "Simple yet full-featured LaTeX editor for GTK/GNOME"
DESCRIPTION = "Setzer is an easy to use yet full-featured LaTeX editor for the GNU/Linux \
desktop, written in Python with Gtk."
LICENSE = "GPL-3.0-or-later"

PV = "57"

RPM_NAME = "Setzer-57-1.2.noarch.rpm"
RPM_HASH = "5eebd76f9d2079ae2cc2f7b78df3fe65aaa98c1ac2e5e9d300ea71c0b2cdd991ccf0ed9b721cd6775a57fea2e235c777546d252617f7c2de2973acec5ffa8fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Setzer"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-bibtexparser \
python3-cairo \
python3-gobject-Gdk \
python3-pexpect \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gtk \
typelib-GtkSource \
typelib-Pango \
typelib-PangoCairo \
typelib-Poppler \
typelib-WebKit \
typelib-Xdp"

inherit rpm
