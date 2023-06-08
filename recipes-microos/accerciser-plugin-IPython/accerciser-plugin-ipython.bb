SUMMARY = "Accessibility debugging tool - IPython console widget"
DESCRIPTION = "Accerciser is an interactive Python accessibility explorer for the \
GNOME desktop. \
 \
This package provides the IPython console widget"
LICENSE = "BSD-3-Clause"

PV = "3.40.0"

RPM_NAME = "accerciser-plugin-IPython-3.40.0-1.3.noarch.rpm"
RPM_HASH = "aad6de876a94033bcf5487c2b9415d3d34fa756811b519f48d9fe1b3cfd9eaf40dae69948a8d5d3eef665d7f8fe6a1c2845c66576ff8d3e7d3e3ebd0ff74b143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "accerciser-plugin-IPython"
RDEPENDS:${PN} += "/usr/bin/python3 accerciser python3-ipython python3-setuptools typelib(GLib) typelib(Gdk) typelib(Gtk) typelib(Pango)"

inherit rpm
