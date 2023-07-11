SUMMARY = "Proton VPN NetworkManager library"
DESCRIPTION = "The Proton VPN NetworkManager library"
LICENSE = "GPL-3.0-or-later"

PV = "3.14.0"

RPM_NAME = "python310-protonvpn-nm-lib-3.14.0-1.5.noarch.rpm"
RPM_HASH = "2996849a6271f2b538d504a62375802f15e588b81115b2d6ac0279caa72b7c0a69e7ce5c1bf7742aa112b7f14963d0a50677bd31d20a94f375e6f28742152721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-protonvpn-nm-lib \
python310-protonvpn-nm-lib \
python3dist-protonvpn-nm-lib"

RDEPENDS:${PN} += "NetworkManager-openvpn \
dbus-1-x11 \
python-abi \
python310-Jinja2 \
python310-dbus-python \
python310-distro \
python310-gobject \
python310-keyring \
python310-proton-client \
python310-pyxdg \
python310-systemd \
typelib-GLib \
typelib-NM"

inherit rpm
