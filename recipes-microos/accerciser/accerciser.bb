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

RPM_NAME = "accerciser-3.40.0-1.3.noarch.rpm"
RPM_HASH = "3d77d9d2f4347b37985923de45b1000e23eaf2564a3d264478c2c64393df518cd163b8207f45e4f4e48835d0866d3eeef7335684749f6ddfba822336932ea31d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "accerciser application() application(accerciser.desktop) metainfo() metainfo(accerciser.appdata.xml)"
RDEPENDS:${PN} += "/usr/bin/python3 py3atspi python(abi) python3-gobject-Gdk python3-python-xlib typelib(Atk) typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gtk) typelib(Pango) typelib(Rsvg) typelib(Wnck)"

inherit rpm
