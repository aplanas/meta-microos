SUMMARY = "GTK indicator applet for gammastep"
DESCRIPTION = "This package provides a status icon for gammastep that allows the user \
to control color temperature."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.9"

RPM_NAME = "gammastep-indicator-2.0.9-1.3.aarch64.rpm"
RPM_HASH = "21a724aac580049735715ba315f1df1079525a3380e1348d221d43839f437739c6752be57b2d8cad5473b04866c6f4502191f7d01144ea44ccead91953828fc6"

RPROVIDES:${PN} += "gammastep-indicator"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3dist-pygobject \
python3dist-pyxdg \
typelib-AyatanaAppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-Gtk"

inherit rpm
