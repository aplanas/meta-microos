SUMMARY = "NetworkManager dispatcher script for DNS dnsmasq configuration"
DESCRIPTION = "NetworkManager attempts to keep an active network connection \
available at all times. The point of NetworkManager is to make \
networking configuration and setup as painless and automatic as \
possible. If using DHCP, NetworkManager is intended to replace \
default routes, obtain IP addresses from a DHCP server, and change \
name servers whenever it sees fit. \
 \
This package provides a NetworkManager dispatcher script for DNS \
dnsmasq configuration."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "NetworkManager-dns-dnsmasq-1.0-1.2.noarch.rpm"
RPM_HASH = "35d16e29d2ca2423322d45ef7fd076406909cea43ffd7702028769ca6c566214c70578d82e9990bd5c2ee328751e24ab45c35e339b2e9c8638fdceb4a87e7795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-dns-dnsmasq"

RDEPENDS:${PN} += "/usr/bin/bash \
NetworkManager"

inherit rpm
