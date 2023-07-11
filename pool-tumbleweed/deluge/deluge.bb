SUMMARY = "BitTorrent Client"
DESCRIPTION = "Deluge is a Free Software, cross-platform BitTorrent client on \
Python and Gtk3 with multiple user interfaces in client/server \
model."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "2.1.1"

RPM_NAME = "deluge-2.1.1-3.6.noarch.rpm"
RPM_HASH = "d96108744f302d3eaf270cc6e70e0c77282fae8d3f21cf823b524185312429bbc9e7b55f788a503b8894af512bcf955069548e61e24389e39b953befaa53b42d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deluge \
python3.11dist-deluge \
python3dist-deluge"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-Mako \
python3-Pillow \
python3-Twisted-tls \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-libtorrent-rasterbar \
python3-pyOpenSSL \
python3-pycairo \
python3-pyxdg \
python3-rencode \
python3-setproctitle \
python3-setuptools \
python3-six \
python3-zope.interface \
typelib-AppIndicator3 \
typelib-GObject \
typelib-Gdk \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-PangoCairo \
typelib-Wnck \
typelib-cairo \
xdg-utils"

inherit rpm
