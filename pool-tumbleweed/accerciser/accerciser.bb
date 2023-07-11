SUMMARY = "Accessibility debugging tool"
DESCRIPTION = "Accerciser is an interactive Python accessibility explorer for the \
GNOME desktop. It uses AT-SPI to inspect and control widgets, allowing \
you to check if an application is providing correct information to \
assistive technologies and automated test frameworks. Accerciser has a \
simple plugin framework which you can use to create custom views of \
accessibility information. \
 \
In essence, Accerciser is a next generation at-poke tool."
LICENSE = "BSD-3-Clause"

PV = "3.40.0"

RPM_NAME = "accerciser-3.40.0-1.4.noarch.rpm"
RPM_HASH = "ae828f40fd9e05b5a8ec4139c324f4fc4b287c7b22bae2a102316bbd1974ea795d131512fa3701bfb4ae72bbdb9bce627d6be77bf5a0bfd0c4e94c03e16d6c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "accerciser"

RDEPENDS:${PN} += "/usr/bin/python3 \
py3atspi \
python-abi \
python3-gobject-Gdk \
python3-python-xlib \
typelib-Atk \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk \
typelib-Pango \
typelib-Rsvg \
typelib-Wnck"

inherit rpm
