SUMMARY = "Context Menu comparison extension for Nemo file manager"
DESCRIPTION = "Simple context menu file comparison extension for Nemo, inspired by \
the discontinued 'diff-ext' extension. By default it uses 'meld' to \
do the comparison and provides 'Compare', 'Compare to ~/foo/bar' and \
'Compare Later' in Nemo context menu. Using the configurator tool \
you can choose your favourite compare tool for one-on-one, \
three-way and multi-compare situations."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-compare-5.2.0-3.6.noarch.rpm"
RPM_HASH = "a4932c9ca2868815459772df39d423c4f9d20bf71585f902d5a4d2a8e61d803d70c5c490fc5ede6dd10f27191f7c51420b2efda6b6ca83c91c3728dca4e793af"
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
