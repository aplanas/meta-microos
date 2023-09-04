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

PV = "1.8.1"

RPM_NAME = "gajim-1.8.1-1.1.noarch.rpm"
RPM_HASH = "317c44a6e54c535b2e6c45cebbc117d81eeb33e41591173673d9a589107fcb04f0245d5abf89f4ca2b268cda43a62f3675a2c28cb705a46b4c9d7c6e4df6648a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gajim \
python3.11dist-gajim \
python3dist-gajim"

RDEPENDS:${PN} += "-python3.11dist(nbxmpp) < 5 with python3.11dist(nbxmpp) >= 4.3 \
-python3.11dist(omemo-dr) < 2 with python3.11dist(omemo-dr) >= 1 \
/usr/bin/python3.11 \
ca-certificates-mozilla \
python-abi \
python3.11dist-cryptography \
python3.11dist-css-parser \
python3.11dist-gssapi \
python3.11dist-keyring \
python3.11dist-omemo-dr \
python3.11dist-packaging \
python3.11dist-pillow \
python3.11dist-precis-i18n \
python3.11dist-pycairo \
python3.11dist-pygobject \
python3.11dist-qrcode \
python311-gobject-Gdk \
python311-gobject-cairo \
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
