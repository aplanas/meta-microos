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

RPM_NAME = "dhcp-client-4.4.2.P1-14.3.aarch64.rpm"
RPM_HASH = "55d06c362f2569f9fa6279c49bec55d63ce574ed7756e7cfa88c2a7905e1f70cc19fb00f2d3e3c21c9a64010ff894729cdb6902f5a6f588a8d62894494cef056"

RPROVIDES:${PN} += "config(dhcp-client) \
dhcp-client \
dhcp-client(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/getent \
/usr/bin/hostname \
dhcp \
iproute2 \
iputils \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
