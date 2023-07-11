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

PV = "1.8.0"

RPM_NAME = "gajim-1.8.0-1.2.noarch.rpm"
RPM_HASH = "c98531fa321cae46bc6fa033e8cb1e260dac5e77ff459ed07f11301c49891047e87f6c1b4f59404e2c7e4ba5c069aba0159b4e5212eb44c9b2799c359de0bb56"
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
