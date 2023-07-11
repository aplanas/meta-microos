SUMMARY = "ISC DHCP Client"
DESCRIPTION = "This is an alternative DHCP client, the ISC DHCP client for Linux. Like \
'dhcpcd' (the client that is installed by default), it can be used to \
configure the network setup.  IP address, hostname, routing, \
nameserver, netmask, and broadcast can be dynamically assigned while \
booting the machine. \
 \
It is configurable via the configuration file /etc/dhclient.conf and \
you can define your own 'hooks' to be used by the /sbin/dhclient-script \
(which is called by the daemon)."
LICENSE = "MPL-2.0"

PV = "4.4.2.P1"

RPM_NAME = "dhcp-client-4.4.2.P1-14.4.aarch64.rpm"
RPM_HASH = "c0a3ee721d78a8d97c7cde17f63785553da5e248e0d7963e1d8294d4c6987b6a5001a9eab56025603b6b943751a663fa8af6e98668a59838f509a6c8e6c149fd"

RPROVIDES:${PN} += "config-dhcp-client \
dhcp-client"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/getent \
/usr/bin/hostname \
dhcp \
iproute2 \
iputils \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
