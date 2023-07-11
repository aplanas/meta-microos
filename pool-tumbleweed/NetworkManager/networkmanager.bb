SUMMARY = "Standard Linux network configuration tool suite"
DESCRIPTION = "NetworkManager attempts to keep an active network connection available \
at all times. The point of NetworkManager is to make networking \
configuration and setup as painless and automatic as possible. If \
using DHCP, NetworkManager is intended to replace default routes, \
obtain IP addresses from a DHCP server, and change name servers \
whenever it sees fit."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.8"

RPM_NAME = "NetworkManager-1.42.8-1.1.aarch64.rpm"
RPM_HASH = "587bcbf45a73744a9915755e6cd10f5b90580be0cdc662f7517775a1620d5d66c45547a34420c11ba18c7d13735a13d2c35f7bf1cc81b60489145286ac158a0d"

RPROVIDES:${PN} += "NetworkManager \
NetworkManager-wifi \
config-NetworkManager \
dhcdbd \
libnm-device-plugin-wifi.so \
service-network \
sysvinit-network"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
NetworkManager-branding \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libndp.so.0 \
libnm.so.0 \
libnspr4.so \
libnss3.so \
libpsl.so.5 \
libreadline.so.8 \
libselinux.so.1 \
libsmime3.so \
libsystemd.so.0 \
libudev.so.1 \
mozilla-nss \
wpa-supplicant"

inherit rpm
