SUMMARY = "Context Menu comparison extension for Nemo file manager"
DESCRIPTION = "Simple context menu file comparison extension for Nemo, inspired by \
the discontinued 'diff-ext' extension. By default it uses 'meld' to \
do the comparison and provides 'Compare', 'Compare to ~/foo/bar' and \
'Compare Later' in Nemo context menu. Using the configurator tool \
you can choose your favourite compare tool for one-on-one, \
three-way and multi-compare situations."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-compare-5.2.0-3.4.noarch.rpm"
RPM_HASH = "3e0d80bbd1aea4811e485db28ae6eae99a67f3702a0c29048fe88ec02fb8c1e8061143dbd6a61ed9e616b21add7cd660b44a4c7ba96622a5efb74031db8e05bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-compare \
nemo-extension-compare \
python3.10dist(nemo-compare) \
python3dist(nemo-compare)"

RDEPENDS:${PN} += "/usr/bin/python3 \
meld \
nemo \
python(abi) \
python3-gobject \
python3-nemo \
python3-pyxdg \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Gtk) \
typelib(Nemo)"

inherit rpm
