SUMMARY = "Proton VPN NetworkManager library"
DESCRIPTION = "The Proton VPN NetworkManager library"
LICENSE = "GPL-3.0-or-later"

PV = "3.14.0"

RPM_NAME = "python311-protonvpn-nm-lib-3.14.0-1.4.noarch.rpm"
RPM_HASH = "7656491987b447a577150cff2f3d97b0fb809afbbc596e9870dae240caaeced0daee560e3eddbfb569f03f3c734de034cbf40cdbede82364d0fec08b1f3243f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-protonvpn-nm-lib \
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
