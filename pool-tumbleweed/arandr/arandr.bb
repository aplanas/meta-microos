SUMMARY = "Visual Front End for XRandR"
DESCRIPTION = "ARandR is designed to provide a simple visual front end for XRandR. Relative \
monitor positions are shown graphically and can be changed in a drag-and-drop \
way."
LICENSE = "GPL-3.0-only"

PV = "0.1.11"

RPM_NAME = "arandr-0.1.11-1.2.noarch.rpm"
RPM_HASH = "a614aa3330ebaa8fe5d7356284be31ff6bc19a5f36b04fe6169f36ff72635fb0229b1c316c5da0d189e91f2242877f5b3951725aa84ae1c167e70325813cf372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arandr \
python3.10dist-arandr \
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
