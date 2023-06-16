SUMMARY = "NetworkManager dispatcher script for DNS bind configuration"
DESCRIPTION = "NetworkManager attempts to keep an active network connection \
available at all times. The point of NetworkManager is to make \
networking configuration and setup as painless and automatic as \
possible. If using DHCP, NetworkManager is intended to replace \
default routes, obtain IP addresses from a DHCP server, and change \
name servers whenever it sees fit. \
 \
This package provides a NetworkManager dispatcher script for DNS \
bind configuration."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "NetworkManager-dns-bind-1.0-1.2.noarch.rpm"
RPM_HASH = "50450aed9079b626dc955375f9e8ad91fab2f72bcef104f1d1a4b3aedd58332b411ecd132a636f837680acb051cd06d163fdc5fc0234d4a7863749bee7d09003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-dns-bind"

RDEPENDS:${PN} += "/usr/bin/bash \
NetworkManager"

inherit rpm
