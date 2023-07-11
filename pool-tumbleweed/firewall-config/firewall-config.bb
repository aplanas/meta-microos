SUMMARY = "Firewall configuration application"
DESCRIPTION = "The firewall configuration application provides an configuration interface for \
firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewall-config-2.0.0-1.1.noarch.rpm"
RPM_HASH = "cb805ff89f4d4f4f968c0804315911896dbd6ade83e960c49015b0e0795d1a50a4cc0d53d42bf845709c79b2160d12c4dd1a060fbb1bbff9816c4d7a99bfa46c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewall-config"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
firewalld \
hicolor-icon-theme \
python3-gobject-Gdk \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango"

inherit rpm
