SUMMARY = "Proton VPN NetworkManager library"
DESCRIPTION = "The Proton VPN NetworkManager library"
LICENSE = "GPL-3.0-or-later"

PV = "3.14.0"

RPM_NAME = "python310-protonvpn-nm-lib-3.14.0-1.4.noarch.rpm"
RPM_HASH = "7947e8c848a5d628de0bab1753fbc8cd4c6443e6829c6b37c1bebd89e8f933ad3a28e6d0c6eabf1dfb60d7cce7b176cb610e426d97f7940b432139ab0adfe5b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-protonvpn-nm-lib \
python3.10dist-protonvpn-nm-lib \
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
