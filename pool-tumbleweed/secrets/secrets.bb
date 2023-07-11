SUMMARY = "A password manager for GNOME"
DESCRIPTION = "Secrets is a password manager which makes use of the Keepass v.4 \
format. \
It integrates with the GNOME desktop and provides an interface for \
the management of password databases."
LICENSE = "GPL-3.0-or-later"

PV = "7.3"

RPM_NAME = "secrets-7.3-1.2.noarch.rpm"
RPM_HASH = "0caef759e415059e6924794476252b921181cefa1550c9c7271e99106f556f046eaa11a30fc556694713d84296b120dc63253822bcee64f4ace6b87e8cbcd77b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-passwordsafe \
secrets"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-argon2-cffi \
python3-gobject-Gdk \
python3-lxml \
python3-pycryptodome \
python3-pykeepass \
python3-pyotp \
python3-validators \
python3-zxcvbn \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Graphene \
typelib-Gtk"

inherit rpm
