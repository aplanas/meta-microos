SUMMARY = "Context Menu comparison extension for Nemo file manager"
DESCRIPTION = "Simple context menu file comparison extension for Nemo, inspired by \
the discontinued 'diff-ext' extension. By default it uses 'meld' to \
do the comparison and provides 'Compare', 'Compare to ~/foo/bar' and \
'Compare Later' in Nemo context menu. Using the configurator tool \
you can choose your favourite compare tool for one-on-one, \
three-way and multi-compare situations."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-compare-5.2.0-4.1.noarch.rpm"
RPM_HASH = "001adedd2bc0494f92641e7ca72beca8503cf745f4558ab94736c9956771464f4740aeeb82bef74bdbbd5efc0df84b746c1e0cbb4ed6d1e3bcd901c8df4a5fb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-compare \
nemo-extension-compare \
python3.11dist-nemo-compare \
python3dist-nemo-compare"

RDEPENDS:${PN} += "/usr/bin/python3 \
meld \
nemo \
python-abi \
python3-gobject \
python3-nemo \
python3-pyxdg \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-Nemo"

inherit rpm
