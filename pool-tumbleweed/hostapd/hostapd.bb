SUMMARY = "Daemon for running a WPA capable Access Point"
DESCRIPTION = "hostapd is a user space daemon for access point and authentication \
servers. It implements IEEE 802.11 access point management, IEEE \
802.1X/WPA/WPA2/EAP Authenticators, RADIUS client, EAP server, and \
RADIUS authentication server. Currently, hostapd supports HostAP, \
madwifi, and prism54 drivers. It also supports wired IEEE 802.1X \
authentication via any ethernet driver."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.10"

RPM_NAME = "hostapd-2.10-2.8.aarch64.rpm"
RPM_HASH = "7887dd7f63309123e860019b3d72393bdbd66cb75d09d5482f9338dbff04a356eb83e26777d21690404dd3cbbfef2c7b96202d6ec485ee71bf034037dd665667"

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
