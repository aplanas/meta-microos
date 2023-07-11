SUMMARY = "Tray icon to manage Compiz"
DESCRIPTION = "This package provides a tray icon that allows you to easily enable, \
disable and restart Compiz, and change the currently used window \
manager and/or window decorator."
LICENSE = "GPL-2.0+"

PV = "0.2.4"

RPM_NAME = "fusion-icon-0.2.4-1.19.noarch.rpm"
RPM_HASH = "aa7c01c5ca1826dcb785d405016f1bfd56cd68c6efd9538c4b386d1c50399fbf74c559fc29d6a69219f633a372a6aec8b7ebdc8ef31fe6074fa7319753befcc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fusion-icon \
python3.11dist-fusion-icon \
python3dist-fusion-icon"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
Mesa-demo-x \
python-abi \
python3-compizconfig \
python3-gobject \
python3-gobject-Gdk \
python3-qt5 \
typelib-AppIndicator3 \
typelib-Gdk \
typelib-Gtk \
xvinfo"

inherit rpm
