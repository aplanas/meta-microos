SUMMARY = "Universial predictive text companion"
DESCRIPTION = "Pypresagemate is a universal predictive text companion. Pypresagemate works alongside any AT-SPI aware application. The Assistive Technology Service Provider Interface (AT-SPI) is a toolkit-neutral way of providing accessibility facilities in applications. Pypresagemate works in the background by tracking what keystrokes are typed and displaying predictions in its window. When a prediction is selected, text is sent to the active application."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-presagemate-0.9.1-13.1.noarch.rpm"
RPM_HASH = "e5ac0e4cf86522b682fe985a812771ec0dfa10c6f5b6abd6757910cd441cebf59c8eaec0b4564c361a67a0236a83b64042c5209f2eddf65ebd7c5e6fd38e657c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-presagemate \
python3-presagemate"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-atspi \
python3-gobject \
python3-presage \
python3-xlib \
typelib(Gdk) \
typelib(Gtk) \
typelib(Pango)"

inherit rpm
