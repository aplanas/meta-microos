SUMMARY = "Additional extensions for Inkscape"
DESCRIPTION = "Extra extensions for Inkscape. Recommended for everybody who wants to \
use Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-extra-1.2.2-3.3.aarch64.rpm"
RPM_HASH = "3c3546998ced71e0f51c4f03ab3b4a3309cde5b59ca62ec249a15aa3cf51edb34de608a55a0eb70c1c1fc4843c5e5d5075ca72b24b2036b4a6eb6866e2d2145b"

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
