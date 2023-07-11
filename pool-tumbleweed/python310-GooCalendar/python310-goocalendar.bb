SUMMARY = "A calendar widget for GTK using PyGoocanvas"
DESCRIPTION = "A calendar widget for GTK using PyGoocanvas (Gnome widget linrary)."
LICENSE = "GPL-2.0-only"

PV = "0.8.0"

RPM_NAME = "python310-GooCalendar-0.8.0-1.3.noarch.rpm"
RPM_HASH = "996947855c55eb43b8d46a79dd9ba6e15cc25cdcd039d85b54a0e6eb47877c21e7956a64df7035f3f7b83e8ff7e875282383a653bd5214cb5573abafbf662118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-goocalendar \
python310-GooCalendar \
python3dist-goocalendar"

RDEPENDS:${PN} += "python-abi \
typelib-GObject \
typelib-Gdk \
typelib-GooCanvas \
typelib-Gtk \
typelib-Pango"

inherit rpm
