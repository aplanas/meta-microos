SUMMARY = "GTK indicator applet for gammastep"
DESCRIPTION = "This package provides a status icon for gammastep that allows the user \
to control color temperature."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.9"

RPM_NAME = "gammastep-indicator-2.0.9-1.2.aarch64.rpm"
RPM_HASH = "50e8f143c6c358dc6bb71ba6c1af8667854eb7374e218a6a8bfa40a1156661cd3e840413a01715522529e889e1dff950ff0b067fa3fdafeb73ec6e604e71ece1"

RPROVIDES:${PN} += "application() \
application(gammastep-indicator.desktop) \
gammastep-indicator \
gammastep-indicator(aarch-64) \
metainfo() \
metainfo(gammastep-indicator.appdata.xml)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
python3dist(pygobject) \
python3dist(pyxdg) \
typelib(AyatanaAppIndicator3) \
typelib(GLib) \
typelib(GObject) \
typelib(Gtk)"

inherit rpm
