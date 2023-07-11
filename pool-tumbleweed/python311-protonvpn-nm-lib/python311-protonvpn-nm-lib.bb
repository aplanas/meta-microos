SUMMARY = "Proton VPN NetworkManager library"
DESCRIPTION = "The Proton VPN NetworkManager library"
LICENSE = "GPL-3.0-or-later"

PV = "3.14.0"

RPM_NAME = "python311-protonvpn-nm-lib-3.14.0-1.5.noarch.rpm"
RPM_HASH = "b8df91d7c795fc81e480a603985300a83e764728f5b745f4f8f1442b0218020016abc0fef972b453ea8ea1bcd8a48279c68b817041470019fbab5c4143e4a5ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-protonvpn-nm-lib \
python3.11dist-protonvpn-nm-lib \
python311-protonvpn-nm-lib \
python3dist-protonvpn-nm-lib"

RDEPENDS:${PN} += "NetworkManager-openvpn \
dbus-1-x11 \
python-abi \
python311-Jinja2 \
python311-dbus-python \
python311-distro \
python311-gobject \
python311-keyring \
python311-proton-client \
python311-pyxdg \
python311-systemd \
typelib-GLib \
typelib-NM"

inherit rpm
