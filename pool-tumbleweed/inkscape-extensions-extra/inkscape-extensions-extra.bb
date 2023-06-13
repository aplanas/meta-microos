SUMMARY = "Additional extensions for Inkscape"
DESCRIPTION = "Extra extensions for Inkscape. Recommended for everybody who wants to \
use Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-extra-1.2.2-3.1.aarch64.rpm"
RPM_HASH = "77aacadb159dd0db5fc56946865ebbde79ef821c49101518f3258f706e5a49f384d5be086ff4d4fcc8db5a59366342bd764ef3b0f5b3d7704bcbd2f7cf7cdde2"

RPROVIDES:${PN} += "inkscape-extensions-extra \
inkscape-extensions-extra(aarch-64)"

RDEPENDS:${PN} += "ghostscript \
inkscape \
python3-lxml \
python3-numpy \
python3-scour \
python3-xml \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gtk) \
typelib(Pango)"

inherit rpm
