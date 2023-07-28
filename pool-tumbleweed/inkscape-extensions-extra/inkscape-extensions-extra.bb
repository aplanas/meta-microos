SUMMARY = "Additional extensions for Inkscape"
DESCRIPTION = "Extra extensions for Inkscape. Recommended for everybody who wants to \
use Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-extra-1.2.2-3.4.aarch64.rpm"
RPM_HASH = "4e4781eeb88b49830797318402f5b16feebe8fba3d1c0341f2672d4da85bf6304cc37cc5a17d8bd1c79772b8c4aad23c93d605452fb793e192209510ff34ce24"

RPROVIDES:${PN} += "inkscape-extensions-extra"

RDEPENDS:${PN} += "ghostscript \
inkscape \
python3-lxml \
python3-numpy \
python3-scour \
python3-xml \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk \
typelib-Pango"

inherit rpm
