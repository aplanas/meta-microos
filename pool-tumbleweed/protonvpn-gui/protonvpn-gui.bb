SUMMARY = "Official Proton VPN GUI"
DESCRIPTION = "The Proton VPN GUI is intended for every Proton VPN service user."
LICENSE = "GPL-3.0-or-later"

PV = "1.12.0"

RPM_NAME = "protonvpn-gui-1.12.0-1.2.noarch.rpm"
RPM_HASH = "2fc51ec5b6993423a458c1a4638fd0a51dd4900102d7ea8d8e75709abd2a56b9c19bc64abaa60436b8edb7f3c7991b917a2b8293ba6f8a709e8ebf741fe0437d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "protonvpn \
protonvpn-gui \
python3.10dist-protonvpn-gui \
python3dist-protonvpn-gui"

RDEPENDS:${PN} += "/usr/bin/python3 \
gtk3 \
python-abi \
python3-gobject-Gdk \
python3-protonvpn-nm-lib \
python3-psutil \
typelib-AppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-WebKit2"

inherit rpm
