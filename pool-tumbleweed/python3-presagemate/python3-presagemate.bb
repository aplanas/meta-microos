SUMMARY = "Universial predictive text companion"
DESCRIPTION = "Pypresagemate is a universal predictive text companion. Pypresagemate works alongside any AT-SPI aware application. The Assistive Technology Service Provider Interface (AT-SPI) is a toolkit-neutral way of providing accessibility facilities in applications. Pypresagemate works in the background by tracking what keystrokes are typed and displaying predictions in its window. When a prediction is selected, text is sent to the active application."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-presagemate-0.9.1-13.2.noarch.rpm"
RPM_HASH = "ddd7d285eacdd3948aef011cbf2bc02711745d384378dbc143c4ad406f698aed739eaf697d83b54454101257b44c277193122fd7103502e7cedee0ccb15b9be4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-presagemate \
python3-presagemate"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-atspi \
python3-gobject \
python3-presage \
python3-xlib \
typelib-Gdk \
typelib-Gtk \
typelib-Pango"

inherit rpm
