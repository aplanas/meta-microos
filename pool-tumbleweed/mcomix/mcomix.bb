SUMMARY = "Comics Viewer"
DESCRIPTION = "Comics Viewer forked from comix."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "mcomix-2.1.0-1.3.noarch.rpm"
RPM_HASH = "31a43cff55943bd5f05038416dfeafbd505f7999e722abebaf238ffca1b1ebd49e02188eba04c786603d996742cbdeeb19a0696bb211ad5856af46855568bbba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mcomix \
python3.11dist-mcomix \
python3dist-mcomix"

RDEPENDS:${PN} += "/usr/bin/7z \
/usr/bin/python3 \
python-abi \
python3-Pillow \
python3-gobject-Gdk \
python3-pycairo \
typelib-1-0-Gtk-3-0 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo"

inherit rpm
