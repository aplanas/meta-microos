SUMMARY = "A calendar widget for GTK using PyGoocanvas"
DESCRIPTION = "A calendar widget for GTK using PyGoocanvas (Gnome widget linrary)."
LICENSE = "GPL-2.0-only"

PV = "0.8.0"

RPM_NAME = "python39-GooCalendar-0.8.0-1.3.noarch.rpm"
RPM_HASH = "b85e165f8f2e448abd2290282cd8773b54ecc694f1a65edc75a8cd510f073ca2c3e53f3662cc979b108d4e3a82d9bbf64b02d113a0d1cbf253af3d31f6a99a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-goocalendar \
python39-GooCalendar \
python3dist-goocalendar"

RDEPENDS:${PN} += "python-abi \
typelib-GObject \
typelib-Gdk \
typelib-GooCanvas \
typelib-Gtk \
typelib-Pango"

inherit rpm
