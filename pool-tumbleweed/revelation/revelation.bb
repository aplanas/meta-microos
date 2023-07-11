SUMMARY = "Password manager for GNOME"
DESCRIPTION = "Revelation is a password manager. It organizes accounts in \
a tree structure, and stores them as AES-encrypted XML files."
LICENSE = "GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "revelation-0.5.4-2.7.noarch.rpm"
RPM_HASH = "3df23c8e6094aaed6f3d04ff6b791d218542310433874ef9ff6174c502fa2099b17ee7b6532f1de9ffd3dbdcb9a79affa2ed793fc60615e9e85b72e482c1598e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "revelation"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-gobject \
python3-gobject-Gdk \
python3-pwquality \
python3-pycryptodomex \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango"

inherit rpm
