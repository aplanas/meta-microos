SUMMARY = "Official Proton VPN GUI"
DESCRIPTION = "The Proton VPN GUI is intended for every Proton VPN service user."
LICENSE = "GPL-3.0-or-later"

PV = "1.12.0"

RPM_NAME = "protonvpn-gui-1.12.0-1.3.noarch.rpm"
RPM_HASH = "300ad56018ffcb6c63bdad83098b2876b5588288955d4357128c53c98570a709d157e99df73b3baf7ddaa8703739cced7ea2807b11a4cf8b597b19d3eda9c3ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "protonvpn \
protonvpn-gui \
python3.11dist-protonvpn-gui \
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
