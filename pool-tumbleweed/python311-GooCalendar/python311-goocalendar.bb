SUMMARY = "A calendar widget for GTK using PyGoocanvas"
DESCRIPTION = "A calendar widget for GTK using PyGoocanvas (Gnome widget linrary)."
LICENSE = "GPL-2.0-only"

PV = "0.8.0"

RPM_NAME = "python311-GooCalendar-0.8.0-1.3.noarch.rpm"
RPM_HASH = "ab55654ddeb00a707d041d71d4b9650738eeb1ef8a1a3932466eabf1f694d32fb13c33bcb74b343e9b11f3907e7a2bb1754528e6b410fe6bb2233778ddb7c206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GooCalendar \
python3.11dist-goocalendar \
python311-GooCalendar \
python3dist-goocalendar"

RDEPENDS:${PN} += "python-abi \
typelib-GObject \
typelib-Gdk \
typelib-GooCanvas \
typelib-Gtk \
typelib-Pango"

inherit rpm
