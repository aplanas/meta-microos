SUMMARY = "Proton VPN NetworkManager library"
DESCRIPTION = "The Proton VPN NetworkManager library"
LICENSE = "GPL-3.0-or-later"

PV = "3.14.0"

RPM_NAME = "python39-protonvpn-nm-lib-3.14.0-1.5.noarch.rpm"
RPM_HASH = "59f05d43fc7a703aa56dc380b6bf2612adfa8fcaa4e0e5c28215f67b19fe88a8627f8b81401c327e5c1cdf2d27d7ddd209205ba793b6a6ba2d483c45e5047a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-protonvpn-nm-lib \
python39-protonvpn-nm-lib \
python3dist-protonvpn-nm-lib"

RDEPENDS:${PN} += "NetworkManager-openvpn \
dbus-1-x11 \
python-abi \
python39-Jinja2 \
python39-dbus-python \
python39-distro \
python39-gobject \
python39-keyring \
python39-proton-client \
python39-pyxdg \
python39-systemd \
typelib-GLib \
typelib-NM"

inherit rpm
