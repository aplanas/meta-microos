SUMMARY = "A calendar widget for GTK using PyGoocanvas"
DESCRIPTION = "A calendar widget for GTK using PyGoocanvas (Gnome widget linrary)."
LICENSE = "GPL-2.0-only"

PV = "0.8.0"

RPM_NAME = "python310-GooCalendar-0.8.0-1.2.noarch.rpm"
RPM_HASH = "8df451a14cfc01273ab150676d5ed5d93727044e1a457e3d5be202ce471512001b8d72d12e0dec7f0b306af32208dc9810ba15d0377446ea5e2ad02ce7fd8a3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GooCalendar \
python3.10dist(goocalendar) \
python310-GooCalendar \
python3dist(goocalendar)"

RDEPENDS:${PN} += "python(abi) \
typelib(GObject) \
typelib(Gdk) \
typelib(GooCanvas) \
typelib(Gtk) \
typelib(Pango)"

inherit rpm
