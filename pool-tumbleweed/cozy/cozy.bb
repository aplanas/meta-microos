SUMMARY = "Audio Book Player"
DESCRIPTION = "Play and organize your audio book collection."
LICENSE = "GPL-3.0-only"

PV = "1.2.1"

RPM_NAME = "cozy-1.2.1-2.1.noarch.rpm"
RPM_HASH = "46131e1e34d59a847643f727978c387af8dc228d456930287fb5489f7af37217ae11e595ad01b21c606bb75e2ead48d9063d0d728e366ad0c0930aae3048e135"
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
