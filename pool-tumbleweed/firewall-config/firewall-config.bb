SUMMARY = "Firewall configuration application"
DESCRIPTION = "The firewall configuration application provides an configuration interface for \
firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewall-config-1.3.2-2.1.noarch.rpm"
RPM_HASH = "487a36b4690c343e39816122c334faa6acfd5ed5588e5bb1632d051c26cc8da2105ded72a01a23b84860eabcb0944e8ecdafbd5bce334a74c7f2414b336f9fef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewall-config"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
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
