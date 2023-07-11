SUMMARY = "An interface for access to applications and documents"
DESCRIPTION = "Kupfer is an interface for access to applications \
and their documents. \
 \
The most typical use is to find a specific application and launch it. \
Kupfer can be extended with plugins so that its quick-access \
paradigm can be extended to many more objects than just \
applications."
LICENSE = "GPL-3.0-or-later"

PV = "322"

RPM_NAME = "kupfer-322-1.2.noarch.rpm"
RPM_HASH = "d1f0e22b785bc4ab288f1a546ced32e54a23294d722dcf6080abb3f4e98ad421f84cb97439e9e78acb02e3cc63eb924012c00be937187ecc5d8d908a2fc7acc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kupfer"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
gvfs \
hicolor-icon-theme \
python3-cairo \
python3-dbus-python \
python3-docutils \
python3-gobject \
python3-gobject-Gdk \
python3-libxml2 \
python3-pyxdg \
shared-mime-info \
typelib-1-0-Gtk-3-0 \
typelib-1-0-Keybinder-3-0 \
typelib-1-0-Wnck-3-0 \
update-desktop-files"

inherit rpm
