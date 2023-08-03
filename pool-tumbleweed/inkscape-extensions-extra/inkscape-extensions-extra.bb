SUMMARY = "Additional extensions for Inkscape"
DESCRIPTION = "Extra extensions for Inkscape. Recommended for everybody who wants to \
use Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-extra-1.2.2-3.5.aarch64.rpm"
RPM_HASH = "288f56e01f4e3002c96dac4c5d04a75de208311e213b2ecd47d72c4c6e28b615b6476f7645924088b54a417dfe3055169f0900d47be20855cce799ba38bc5037"

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
