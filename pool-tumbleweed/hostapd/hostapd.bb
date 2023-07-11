SUMMARY = "Daemon for running a WPA capable Access Point"
DESCRIPTION = "hostapd is a user space daemon for access point and authentication \
servers. It implements IEEE 802.11 access point management, IEEE \
802.1X/WPA/WPA2/EAP Authenticators, RADIUS client, EAP server, and \
RADIUS authentication server. Currently, hostapd supports HostAP, \
madwifi, and prism54 drivers. It also supports wired IEEE 802.1X \
authentication via any ethernet driver."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.10"

RPM_NAME = "hostapd-2.10-2.10.aarch64.rpm"
RPM_HASH = "033e3333d1110f7a980cb730da288da178f058e43132f42766e005b94bc2bd2041c0adfafc9cb08e77994f4aceeba59751aa26a9900f7b1453ba78f40143e77f"

RPROVIDES:${PN} += "config-hostapd \
hostapd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libnl-route-3.so.200 \
libsqlite3.so.0 \
libssl.so.3 \
systemd"

inherit rpm
