SUMMARY = "Password manager for GNOME"
DESCRIPTION = "Revelation is a password manager. It organizes accounts in \
a tree structure, and stores them as AES-encrypted XML files."
LICENSE = "GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "revelation-0.5.4-2.6.noarch.rpm"
RPM_HASH = "6fae81f9cf7537ad2b07198a4cb5c35c85050b390f9539d73cd1cdab7e985ce3667d2d326a24780263fc343d0f31d2fb66977fedca3107c741fcda425490f789"
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
