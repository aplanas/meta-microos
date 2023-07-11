SUMMARY = "Accessibility debugging tool - IPython console widget"
DESCRIPTION = "Accerciser is an interactive Python accessibility explorer for the \
GNOME desktop. \
 \
This package provides the IPython console widget"
LICENSE = "BSD-3-Clause"

PV = "3.40.0"

RPM_NAME = "accerciser-plugin-IPython-3.40.0-1.4.noarch.rpm"
RPM_HASH = "b55e367d2085af190885fc034cb53eab70ef13e78751747958beb2972c68441fb08da072093a7d249c6bff50dbdd430d2c4ea7a228eb94b04f78214684150688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "accerciser-plugin-IPython"

RDEPENDS:${PN} += "/usr/bin/python3 \
accerciser \
python3-ipython \
python3-setuptools \
typelib-GLib \
typelib-Gdk \
typelib-Gtk \
typelib-Pango"

inherit rpm
