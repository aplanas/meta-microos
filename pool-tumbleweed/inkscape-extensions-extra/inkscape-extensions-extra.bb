SUMMARY = "Additional extensions for Inkscape"
DESCRIPTION = "Extra extensions for Inkscape. Recommended for everybody who wants to \
use Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.3"

RPM_NAME = "inkscape-extensions-extra-1.3-1.1.aarch64.rpm"
RPM_HASH = "07b1a44eb3820aba9b9e5bc47cd0ccc4791446243c14fc8f58efe7ad6ab65d0ae7e405570824ae52a9c5fc12e6d30c8382e3d0ddca6bcc2303429e7c98b37de0"

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
