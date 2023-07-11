SUMMARY = "OpenVPN plugin for connman"
DESCRIPTION = "Provides OpenVPN support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-openvpn-1.41-4.8.aarch64.rpm"
RPM_HASH = "16e6edfe1e588cb445b73a3af2afa4a6e88dae602e133d3243b4395e343f0e347f8f59c7b8874f60463974f2300ed18b54c66e89287ee282c99ed9eb1aef5642"

RPROVIDES:${PN} += "connman-plugin-openvpn"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
openvpn"

inherit rpm
