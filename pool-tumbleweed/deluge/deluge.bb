SUMMARY = "BitTorrent Client"
DESCRIPTION = "Deluge is a Free Software, cross-platform BitTorrent client on \
Python and Gtk3 with multiple user interfaces in client/server \
model."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "2.1.1"

RPM_NAME = "deluge-2.1.1-3.3.noarch.rpm"
RPM_HASH = "0a4eb84ec47da0af6741bfe7bd8f74b7122b6b0b7e7040f296a57fd221d9c29de69a9380057b1db05816167178067316144ae442a2336552fa2324c75f8136b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deluge \
python3.10dist-deluge \
python3dist-deluge"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
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
