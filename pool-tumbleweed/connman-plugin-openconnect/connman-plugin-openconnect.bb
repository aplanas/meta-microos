SUMMARY = "OpenConnect plugin for connman"
DESCRIPTION = "Provides OpenConnect support for Connman (Connection Manager). \
OpenConnect is an open client for Cisco(TM) AnyConnect(TM) VPN."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-openconnect-1.41-4.8.aarch64.rpm"
RPM_HASH = "0cf1cbf7425246086ff99045e5d8131e91823220e21b61efe19aa597996c1ece1cd7a9a4f8366bddfad027da0515f5034793a6fad390f9cf7b3ae9c45bde7f9f"

RPROVIDES:${PN} += "connman-plugin-openconnect"

RDEPENDS:${PN} += "connman \
dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenconnect.so.5 \
openconnect"

inherit rpm
