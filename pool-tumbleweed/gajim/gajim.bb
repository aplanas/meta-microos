SUMMARY = "XMPP client written in Python and GTK"
DESCRIPTION = "Gajim is a Jabber/XMPP client. It works with MATE and GNOME, but does \
require neither to run. \
 \
Features: \
 * Tabbed chat window and single window modes. \
 * Group chat support (with Multi-User Chat protocol), invitation, \
   chat to group chat transformation, minimise group chat to roster. \
 * Emoticons, avatars, PEP (user activity, mood and tune). \
 * Audio / video conferences. \
 * File transfer, room bookmarks. \
 * Metacontacts support. \
 * Trayicon, speller, extended chat history functionalities. \
 * TLS, GPG and End-To-End encryption support (with SSL legacy support). \
 * Transport registration support. \
 * Service discovery including nodes, user search. \
 * Wikipedia, dictionary and search engine lookup. \
 * Multiple accounts support. \
 * DBus capabilities. Read more information. \
 * XML console. \
 * Link local (bonjour / zeroconf), BOSH. \
 * Other features via plugins."
LICENSE = "GPL-3.0-only"

PV = "1.7.3"

RPM_NAME = "gajim-1.7.3-1.1.noarch.rpm"
RPM_HASH = "976a521f91e5ea9b27c5a407c4304f81359bdb5226a204fd96fdd656e9d00c2f4f7afd158438447fbc83f261a682ae517f329b03566db38b854d8d4c1617ffae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gajim \
python3.10dist-gajim \
python3dist-gajim"

RDEPENDS:${PN} += "-python3.10dist(nbxmpp) < 5 with python3.10dist(nbxmpp) >= 4.2.2 \
/usr/bin/python3.10 \
ca-certificates-mozilla \
python-abi \
python3.10dist-cryptography \
python3.10dist-css-parser \
python3.10dist-gssapi \
python3.10dist-keyring \
python3.10dist-packaging \
python3.10dist-pillow \
python3.10dist-precis-i18n \
python3.10dist-pycairo \
python3.10dist-pygobject \
python310-gobject-Gdk \
python310-gobject-cairo \
typelib-AyatanaAppIndicator3 \
typelib-Farstream \
typelib-GLib \
typelib-GObject \
typelib-GSound \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Geoclue \
typelib-Gio \
typelib-Gspell \
typelib-Gst \
typelib-GstPbutils \
typelib-Gtk \
typelib-GtkSource \
typelib-Pango \
typelib-PangoCairo \
typelib-Soup"

inherit rpm
