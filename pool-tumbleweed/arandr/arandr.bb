SUMMARY = "Visual Front End for XRandR"
DESCRIPTION = "ARandR is designed to provide a simple visual front end for XRandR. Relative \
monitor positions are shown graphically and can be changed in a drag-and-drop \
way."
LICENSE = "GPL-3.0-only"

PV = "0.1.11"

RPM_NAME = "arandr-0.1.11-1.3.noarch.rpm"
RPM_HASH = "f0cdd6ae3128d27149d59803430fd51a91ec55ff0a6e07be347637d5a9f880a8040d9732ade4568cf71a0486092c15a6908c1b14300cb630b9a0a76963d3384c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arandr \
python3.11dist-arandr \
python3dist-arandr"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-gobject \
python3-gobject-Gdk \
python3-pycairo \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo \
xrandr"

inherit rpm
