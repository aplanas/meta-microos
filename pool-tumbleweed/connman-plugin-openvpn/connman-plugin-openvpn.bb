SUMMARY = "OpenVPN plugin for connman"
DESCRIPTION = "Provides OpenVPN support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-openvpn-1.41-4.7.aarch64.rpm"
RPM_HASH = "b71194d94510cb9319b96ba9c17857be172031aebc819117422743c0ce7274b32f0604b47b263a40d72bf468cf8648e3a5c08dc68fed1c952ee2fc7cac46717d"

RPROVIDES:${PN} += "connman-plugin-openvpn"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
openvpn"

inherit rpm
