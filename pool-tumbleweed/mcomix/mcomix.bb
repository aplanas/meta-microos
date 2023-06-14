SUMMARY = "Comics Viewer"
DESCRIPTION = "Comics Viewer forked from comix."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "mcomix-2.1.0-1.2.noarch.rpm"
RPM_HASH = "a7034cf108c63cb98b82d95a667562b2b3fdfd3d5aef2285dc150e2561e4dc448c0bac45dd402c0e7c5dc37299e60e7397d518f71a42020d288fe49e384bc9e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mcomix \
python3.10dist-mcomix \
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
