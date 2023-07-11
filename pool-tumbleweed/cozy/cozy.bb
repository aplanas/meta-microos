SUMMARY = "Audio Book Player"
DESCRIPTION = "Play and organize your audio book collection."
LICENSE = "GPL-3.0-only"

PV = "1.2.1"

RPM_NAME = "cozy-1.2.1-2.2.noarch.rpm"
RPM_HASH = "1768fc486c039173b23f76a4fd3fafdcdc00e95930f93826e73cdb622e28737c5a06ceda997417e6df56c78516817281b63f7093995c8edc6fb73ecc377c08fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "com.github.geigi.cozy \
cozy"

RDEPENDS:${PN} += "/usr/bin/python3 \
granite \
libhandy-1-0 \
pkgconfig-libdazzle-1.0 \
python-abi \
python3-apsw \
python3-cairo \
python3-distro \
python3-gst \
python3-mutagen \
python3-packaging \
python3-peewee \
python3-pytaglib \
python3-pytz \
python3-requests \
typelib-Dazzle \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstPbutils \
typelib-Gtk \
typelib-Handy \
typelib-Pango"

inherit rpm
